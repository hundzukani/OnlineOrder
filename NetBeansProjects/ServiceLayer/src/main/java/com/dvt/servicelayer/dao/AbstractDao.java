package com.dvt.servicelayer.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hmanganyi
 * @param <T>
 */
@Repository
public abstract class AbstractDao<T extends Object> implements Dao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    Class<T> domainClass;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    private Class<T> getDomainClass() {

        if (domainClass == null) {
            ParameterizedType thisType
                    = (ParameterizedType) getClass().getGenericSuperclass();

            this.domainClass
                    = (Class<T>) thisType.getActualTypeArguments()[0];
        }
        return domainClass;
    }

    public String getDomainClassName() {
        return getDomainClass().getName();
    }

    @Override
    public void create(T object) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);        
        transaction.commit();
    }

    @Override
    public void update(T object) {
        getSession().update(object);
    }

    @Override
    public void delete(T object) {
        getSession().delete(object);
    }

    @Override
    public void deleteById(Serializable id) {
        getSession().get(domainClass, id);
    }

    @Override
    public long count() {
        return (Long) getSession().createQuery("select count(*) from " + getDomainClassName()).uniqueResult();
    }

    @Override
    public List<T> getAll() {
        return getSession().createQuery("from " + getDomainClassName() ).list();
    }

    @Override
    public T load(Serializable id) {
        return (T)getSession().get(getDomainClassName(), id);
    }

    @Override
    public T get(Serializable id) {
        return (T)getSession().get(getDomainClassName(), id);
    }

    @Override
    public void deleteAll() {
        getSession().createQuery("delete " + getDomainClassName()).executeUpdate();
    }

    @Override
    public boolean exists(Serializable id) {
        return get(id) != null;
    }
}
