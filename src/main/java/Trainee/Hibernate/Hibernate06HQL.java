package Trainee.Hibernate;

import Trainee.Hibernate.POJO.anotation.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by phirayu on 22/7/2558.
 */
public class Hibernate06HQL {
    Logger logger = LoggerFactory.getLogger(Hibernate06HQL.class);
    public static void main(String[] arg){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Hibernate06HQL hibernate06HQL = new Hibernate06HQL();
        //hibernate06HQL.queryHQL(session);
        //hibernate06HQL.updateHQL(session);
        //hibernate06HQL.deleteHQL(session);
        hibernate06HQL.insertHQL(session);


        session.close();
    }
    private void queryHQL(Session session){
        String hql = "select S.firstName as firstName,S.lastName as lastName from Student S where S.firstName = :firstName";
        Query query = session.createQuery(hql);
        query.setString("firstName","Phirayu");
        query.setResultTransformer(Transformers.aliasToBean(Student.class));
        List<Student> studentList = query.list();
        for(Student student:studentList){
            logger.info("Student Name : {} lastname : {}",student.getFirstName(),student.getLastName());
        }
    }
    private void updateHQL(Session session){
        String hql = "update Student S set  S.firstName = :firstName where S.studentId = :studentId";
        Query query = session.createQuery(hql);
        query.setParameter("firstName","jays");
        query.setParameter("studentId", "aaaa");
        session.beginTransaction();
        query.executeUpdate();
        session.getTransaction().commit();

    }
    private void deleteHQL(Session session){
        String hql = "delete Student where studentId = :studentId";
        Query query = session.createQuery(hql);
        query.setString("studentId","aaaaa");
        session.beginTransaction();
        query.executeUpdate();
        session.getTransaction().commit();
        logger.info("delete Success");

    }
    private void insertHQL(Session session){
        String hql = "insert into Student(studentId,firstName)"+
                "select facultyId,name from Faculty";

        Query query = session.createQuery(hql);
        session.beginTransaction();
        query.executeUpdate();
        session.getTransaction().commit();
        logger.info("insert Success");


    }
}
