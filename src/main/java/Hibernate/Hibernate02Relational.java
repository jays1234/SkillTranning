package Hibernate;

import Hibernate.POJO.anotation.Course;
import Hibernate.POJO.anotation.Faculty;
import Hibernate.POJO.anotation.Student;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by phirayu on 20/7/2558.
 */
public class Hibernate02Relational {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Hibernate02Relational.class);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Faculty.class);
        List<Faculty> facultyList = criteria.list();

        for(Faculty faculty:facultyList){
            logger.info(faculty.getName());
            for(Student student: faculty.getStudentSet()){
                logger.info( "Faculty : {} Student :{}",faculty.getName(),student.getFirstName());
            }
            if(faculty.getName().equals("COMSCI")){
                //update
                faculty.setName("CS");
                session.beginTransaction();
                session.saveOrUpdate(faculty);
                session.getTransaction().commit();
            }

        }

        // insert
        /*Faculty faculty = new Faculty();
        faculty.setFacultyId("5");
        faculty.setName("KKK");
        session.beginTransaction();
        session.save(faculty);
        session.getTransaction().commit();
        logger.info("insert faculty : {}",faculty.getName());*/


        //delete
        /*Faculty faculty = facultyList.get(0);
        session.beginTransaction();
        for(Student student:faculty.getStudentSet()){
            student.setFaculty(facultyList.get(1));
        }
        session.merge(faculty);
        session.flush();
        logger.info("delete {}",faculty.getName());
        session.delete(faculty);
        session.getTransaction().commit();*/




    }
}
