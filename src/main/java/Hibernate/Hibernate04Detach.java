package Hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by phirayu on 22/7/2558.
 */
public class Hibernate04Detach {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();



        session.close();
    }
    private void detachCriteria(Session session){

    }
}
