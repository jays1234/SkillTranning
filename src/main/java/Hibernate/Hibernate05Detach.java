package Hibernate;


import Hibernate.POJO.anotation.Course;
import Hibernate.POJO.anotation.Student;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by phirayu on 22/7/2558.
 */
public class Hibernate05Detach {
    Logger logger = LoggerFactory.getLogger(Hibernate05Detach.class);
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Hibernate05Detach hibernate05Detach = new Hibernate05Detach();
        hibernate05Detach.detachCriteria(session);




     session.close();
    }
    private void detachCriteria(Session session){
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Student.class);
        List<Student> studentList = detachedCriteria.getExecutableCriteria(session).list();
        for(Student student:studentList){
            logger.info("Student name : {} last name : {}",student.getFirstName(),student.getLastName());
            for(Course course: student.getCourses()){
                logger.info("name : {} course : {}",student.getFirstName(),course.getName());
            }
        }

    }




}
