package Hibernate;

import Hibernate.POJO.anotation.Faculty;
import Hibernate.POJO.anotation.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by phirayu on 22/7/2558.
 */
public class Hibernate04Insert {
    Logger logger = LoggerFactory.getLogger(Hibernate04Insert.class);
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Hibernate04Insert hibernate04Insert = new Hibernate04Insert();
        hibernate04Insert.insert(session);

        session.close();
    }
    private void insert(Session session){
        Student student = new Student();
        student.setStudentId("aaaaaaa");
        student.setFirstName("insertChild");
        student.setFaculty(getFaculty(session));
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        logger.info("insert Success");

        Criteria criteria = session.createCriteria(Faculty.class);
        List<Faculty> facultyList = criteria.list();
        for(Faculty faculty:facultyList){
            for(Student student1:faculty.getStudentSet()){
                logger.info("Faculty : {} Student :{}",faculty.getName(),student1.getFirstName());
            }
        }
    }
    private Faculty getFaculty(Session session){
        Criteria criteria = session.createCriteria(Faculty.class);
        criteria.add(Restrictions.eq("name","IT"));
        List<Faculty> facultyList = criteria.list();
        return facultyList.get(0);
    }
}
