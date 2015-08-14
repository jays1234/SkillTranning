package Trainee.Hibernate;

import Trainee.Hibernate.POJO.xml.CourseXml;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by phirayu on 19/7/2558.
 */
public class Hibernate01Mapping {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Hibernate01Mapping.class);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

/*
        session.beginTransaction();
        Course course = new Course();
        course.setCourseId("10");
        course.setName("aaa");
        session.save(course);
        session.getTransaction().commit();*/


       Criteria criteria = session.createCriteria(CourseXml.class);
        List<CourseXml> courseList = criteria.list();
        for(CourseXml course:courseList){
            logger.info(course.getCourseId()+" "+course.getName());
        }




    }
}
