package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 22/7/2558.
 */
public class Hibernate05Detach {
    Logger logger = LoggerFactory.getLogger(Hibernate05Detach.class);
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();



     session.close();
    }
    private void detachCriteria(Session session){

    }
}
