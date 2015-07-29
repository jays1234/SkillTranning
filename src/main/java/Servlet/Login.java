package Servlet;

/**
 * Created by phirayu on 22/7/2558.
 */
import Hibernate.POJO.anotation.Account;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(Login.class);

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        createCookie(req,resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       //createCookie(req,resp);
        createSession(req, resp);

    }
    private void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Cookie[] cookies = req.getCookies();
        logger.info("cookie : {}",cookies.length);
        if(cookies.length<1) {
            Cookie cookie = new Cookie("status", "cookie");
            cookie.setMaxAge(60 * 60);
            resp.addCookie(cookie);

        }
        resp.sendRedirect("/Training/jsp/ResultLogin.jsp");
    }
    private void createSession(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
        HttpSession httpSession = req.getSession();
        if(httpSession.getAttribute("status")==null || !httpSession.getAttribute("status").equals("Success")) {
            Session session = createSession();
            Criteria criteria  = session.createCriteria(Account.class);
            Criterion user = Restrictions.eq("user", req.getParameter("user"));
            Criterion pass = Restrictions.eq("pass",req.getParameter("pass"));
            criteria.add(Restrictions.and(user,pass));
            List<Account> accountList = criteria.list();
            String status = null;
            logger.info(accountList.toString()+req.getParameter("user")+" "+req.getParameter("pass"));
            if(accountList.size()==1){
                logger.info("Login Success");
                status = "Success";

            }else{
                logger.info("Login Failed");
                status = "failed";
            }
            httpSession.setAttribute("status", status);
        }
        if(httpSession.getAttribute("status").equals("Success")){
            req.getRequestDispatcher("/jsp/ResultLogin.jsp").forward(req,resp);


        }else{
            req.getRequestDispatcher("/html/Person.xhtml").forward(req,resp);
        }
    }


    private Session createSession(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory.openSession();
    }
}
