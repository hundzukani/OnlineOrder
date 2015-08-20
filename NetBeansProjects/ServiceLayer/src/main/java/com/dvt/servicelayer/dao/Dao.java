package com.dvt.servicelayer.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hmanganyi
 * @param <T>
 */
public interface Dao<T extends Object> {

    public void create(T object);
    
    public void update(T object);
    
    public void delete(T object);
    
    public void deleteById(Serializable id);
    
    public long count();
    
    public List<T> getAll();
    
    public T load(Serializable id);
    
    public T get(Serializable id);
    
    public void deleteAll();
    
    public boolean exists(Serializable id);
    
}
