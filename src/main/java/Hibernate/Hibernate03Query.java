package Hibernate;


import Hibernate.POJO.anotation.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.json.JSONArray;
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
        //hibernate03Query.projections(session);
        //hibernate03Query.projectionList(session);
        //hibernate03Query.customJoin(session);
        //criteria.setFirstResult(0);
        //criteria.setMaxResults(10);
        //criteria.addOrder(Order.desc("firstname"));





        session.close();


    }





    private void customJoin(Session session){
        Criteria criteria = session.createCriteria(Student.class,"student");
        criteria.createAlias("student.faculty","faculty");
        criteria.add(Restrictions.eq("faculty.name", "IT"));
        List<Student> studentList = criteria.list();
        for(Student student: studentList){
            logger.info("Student : {} faculty : {}", student.getFirstName(), student.getFaculty().getName());
        }
       /* Criteria criteria1  = session.createCriteria(Student.class);
        criteria1.add(Restrictions.eq("faculty.name","IT"));*/

    }
    private void projectionList(Session session){
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.property("firstName").as("firstName"));
        projectionList.add(Projections.property("lastName").as("lastName"));
        Criteria criteria = session.createCriteria(Student.class);
        criteria.setProjection(projectionList);
        criteria.setResultTransformer(Transformers.aliasToBean(Student.class));

        List<Student> studentList = criteria.list();
        logger.info("{}",studentList);
        for(Student student:studentList){
           logger.info(student.getFirstName());
        }

        /*for(Object object:criteria.list()) {
            logger.info("projectionList : {}", object);
        }*/

    }
    private void projections(Session session){
        Criteria criteria = session.createCriteria(Student.class);
        criteria.setProjection(Projections.property("firstName"));


        //groupProperty ไม่เอาตัวซ้ำ groupby
        //criteria.setProjection(Projections.property("lastName")); Set ซ้อนกัน เอา อันล่า สุด
        logger.info(criteria.list().get(1).toString());
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
