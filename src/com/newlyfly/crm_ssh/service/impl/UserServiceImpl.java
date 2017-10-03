package com.newlyfly.crm_ssh.service.impl;

import com.newlyfly.crm_ssh.dao.UserDao;
import com.newlyfly.crm_ssh.dao.impl.UserDaoImpl;
import com.newlyfly.crm_ssh.domain.User;
import com.newlyfly.crm_ssh.service.UserService;
import com.newlyfly.crm_ssh.util.HibernateUtil;
import com.newlyfly.crm_ssh.util.MD5Utils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by llf in 11:55 2017/9/28
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByUserNameAndPassword(String userName, String password) {
        return userDao.getUserByUserNameAndPassword(userName, password);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

//    @Override
//    public void save(User user) {
//        user.setUserName("1");
//        user.setPassword(MD5Utils.md5("1"));
//        userDao.save(user);
//    }
}
