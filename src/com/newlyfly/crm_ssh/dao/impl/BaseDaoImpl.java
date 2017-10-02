package com.newlyfly.crm_ssh.dao.impl;

import com.newlyfly.crm_ssh.dao.BaseDao;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by llf in 23:22 2017/10/2
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
    // 用于接收运行期泛型类型
    private Class clazz;

    public BaseDaoImpl() {
        // 获得当前类型的带有泛型类型的父类
        ParameterizedType ptClass = (ParameterizedType) this.getClass().getGenericSuperclass();
        // 获得运行期的泛型类型
        clazz = (Class) ptClass.getActualTypeArguments()[0];
    }

    @Override
    public void save(T t) {
        getHibernateTemplate().save(t);
    }

    @Override
    public void saveOrUpdate(T t) {
        getHibernateTemplate().saveOrUpdate(t);
    }

    @Override
    public void delete(T t) {
        getHibernateTemplate().delete(t);
    }

    @Override
    public void delete(Serializable id) {
        // 先取再删
        T t = getById(id);
        getHibernateTemplate().delete(t);
    }

    @Override
    public void update(T t) {
        getHibernateTemplate().update(t);
    }

    @Override
    public T getById(Serializable id) {
        return getHibernateTemplate().get((Class<T>) clazz, id);
    }

    @Override
    public List<T> listAll() {
        String clazzName = clazz.getName();
        return (List<T>) getHibernateTemplate().find("from " + clazzName, null);
    }

    @Override
    public List<T> listPage(DetachedCriteria detachedCriteria, int start, int end) {
        return (List<T>) getHibernateTemplate().findByCriteria(detachedCriteria, start, end);
    }
}
