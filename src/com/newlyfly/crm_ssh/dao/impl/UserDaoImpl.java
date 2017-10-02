package com.newlyfly.crm_ssh.dao.impl;

import com.newlyfly.crm_ssh.dao.UserDao;
import com.newlyfly.crm_ssh.domain.User;
import com.newlyfly.crm_ssh.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by llf in 11:54 2017/9/28
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

//    @Override
//    public User get(Long id) {
//        User user = HibernateUtil.getCurrentSession().get(User.class, id);
//        return user;
//    }
//
//    @Override
//    public List<User> queryAll(String hql) {
//        //HQL语句查询所有对象
//        Query query = HibernateUtil.getCurrentSession().createQuery(hql);
//        List<User> list = query.list();
//        return list;
//    }
//
//    @Override
//    public void save(User user) {
//        HibernateUtil.getCurrentSession().save(user);
//    }
//
//    @Override
//    public void delete(User user) {
//        HibernateUtil.getCurrentSession().delete(user);
//    }
//
//    @Override
//    public void update(User user) {
//        HibernateUtil.getCurrentSession().update(user);
//    }
//
//    @Override
//    public User queryUserById(Long id) {
//        Query query = HibernateUtil.getCurrentSession().createQuery("from User where userId = ?");
//        query.setParameter(0,id);
//        User user = (User) query.uniqueResult();
//        return user;
//    }
//
//    @Override
//    public User queryUserByUserNameAndPassword(String userName, String password) {
//        Query query = HibernateUtil.getCurrentSession().createQuery("from User where userName = ? and password = ?");
//        query.setParameter(0, userName);
//        query.setParameter(1, password);
//        User user = (User) query.uniqueResult();
//        return user;
//    }
//
//    @Override
//    public User queryUserByUserName(String userName) {
//        Query query = HibernateUtil.getCurrentSession().createQuery("from User where userName = ?");
//        query.setParameter(0, userName);
//        User user = (User) query.uniqueResult();
//        return user;
//    }
//
//    @Override
//    public List<User> queryPage(Integer start,Integer end) {
//        Query query = HibernateUtil.getCurrentSession().createQuery(" from User ");
//        //设置分页limit
//        query.setFirstResult(start);
//        query.setMaxResults(end);
//        List<User> list = query.list();
//        return list;
//    }
//
//    @Override
//    public List<User> criteriaAll() {
//        Criteria criteria = HibernateUtil.getCurrentSession().createCriteria(User.class);//过期
////        HibernateUtil.getCurrentSession().createSQLQuery("select * from user");
//        List<User> list = criteria.list();
//        return list;
//    }
}
