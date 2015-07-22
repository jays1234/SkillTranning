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

    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = createSession();
        Criteria criteria  = session.createCriteria(Account.class);
        /*List<Account> accounts = criteria.list();
        for(Account account:accounts){
            logger.info(account.getUser()+" "+account.getPass());
        }*/
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
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("status",status);
        resp.sendRedirect("/Training/jsp/ResultLogin.jsp");




    }
    private Session createSession(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory.openSession();
    }
}
