package com.newlyfly.crm_ssh.dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * Created by llf in 23:15 2017/10/2
 */
public interface BaseDao<T> {
    // 增
    void save(T t);
    // 增加或修改
    void saveOrUpdate(T t);
    // 删
    void delete(T t);
    // 删，根据id
    void delete(Serializable id);
    // 改
    void update(T t);
    // 根据id查询单条记录
    T getById(Serializable id);
    // 查询所有记录
    List<T> listAll();
    // 分页查询
    List<T> listPage(DetachedCriteria detachedCriteria, int start, int end);

}
