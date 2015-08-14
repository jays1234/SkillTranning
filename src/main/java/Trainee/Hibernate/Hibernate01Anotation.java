package Trainee.Hibernate;

import Trainee.Hibernate.POJO.anotation.Role;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by phirayu on 20/7/2558.
 */
public class Hibernate01Anotation {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Hibernate01Anotation.class);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Role.class);
        List<Role> roleList = criteria.list();
        for(Role role:roleList){
            logger.info(role.getRoleId() +" "+ role.getName());
        }

    }
}
