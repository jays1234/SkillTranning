package Trainee.Spring.dao.impl;

import Trainee.Spring.dao.StudentDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by phirayu on 23/7/2558.
 */
@Repository
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
    @Autowired
    public StudentDaoImpl(SessionFactory sessionFactory){

        super.setSessionFactory(sessionFactory);
    }
    @Override
    public List findStudent() {
        String hql = "From Student";
        return this.getHibernateTemplate().find(hql);
    }
}
