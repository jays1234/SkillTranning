package Hibernate;

import Hibernate.POJO.anotation.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by phirayu on 21/7/2558.
 */
public class Hibernate03Query {
    Logger logger = LoggerFactory.getLogger(Hibernate03Query.class);
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Hibernate03Query hibernate03Query = new Hibernate03Query();
        //hibernate03Query.restriction(session);
        //hibernate03Query.restrictionOr(session);
        //criteria.setFirstResult(0);
        //criteria.setMaxResults(10);
        //criteria.addOrder(Order.desc("firstname"));
        hibernate03Query.Projections(session);




        session.close();


    }
    private void Projections(Session session){
        Criteria criteria = session.createCriteria(Student.class);
        criteria.setProjection(Projections.property("firstName"));
        ProjectionList projectionList = new ProjectionList();
        //groupProperty ไม่เอาตัวซ้ำ
        //criteria.setProjection(Projections.property("lastName")); Set ซ้อนกัน เอา อันล่า สุด
        logger.info(criteria.list().toString());
    }
    private void restrictionOr(Session session){
        Criteria criteria = session.createCriteria(Student.class);
        Criterion firstName = Restrictions.eq("firstName", "Phirayu");
        Criterion lastName = Restrictions.eq("lastName", "sss");
        criteria.add(Restrictions.or(firstName,lastName));

        List<Student> studentList = criteria.list();
        for(Student student:studentList){
            logger.info(student.getFirstName());
        }

    }

    private void restriction(Session session){

        Criteria criteria = session.createCriteria(Student.class);
        criteria.add(Restrictions.eq("firstName", "Phirayu"));
        criteria.add(Restrictions.eq("lastName","songyothin"));
        /*
        gt = more than
        lt = less than
        like = like
        ilike = ignore sensitive case
        between
        isNull
        isNotNull
        isEmpty
        isNotEmpty
         */


        List<Student> studentList = criteria.list();
        for(Student student:studentList){
            logger.info(student.getFirstName());
        }
    }
}
