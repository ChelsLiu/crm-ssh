package com.newlyfly.crm_ssh.dao.impl;

import com.newlyfly.crm_ssh.dao.UserDao;
import com.newlyfly.crm_ssh.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by llf in 11:54 2017/9/28
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Override
    public User getUserByUserNameAndPassword(String userName, String password) {
        List<User> list = (List<User>) getHibernateTemplate().find("from User where userName = ? and password = ?", userName, password);
        return list.get(0);
    }

    @Override
    public User getUserByUserName(String userName) {
        List<User> list = (List<User>) this.getHibernateTemplate().find("from User where userName = ?", userName);
        if(list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }

}
