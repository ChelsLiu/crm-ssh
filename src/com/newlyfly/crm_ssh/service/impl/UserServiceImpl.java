package com.newlyfly.crm_ssh.service.impl;

import com.newlyfly.crm_ssh.dao.UserDao;
import com.newlyfly.crm_ssh.dao.impl.UserDaoImpl;
import com.newlyfly.crm_ssh.domain.User;
import com.newlyfly.crm_ssh.service.UserService;
import com.newlyfly.crm_ssh.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by llf in 11:55 2017/9/28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {

    }

    @Override
    public void saveOrUpdausere(User user) {

    }

    @Override
    public void deleusere(User user) {

    }

    @Override
    public void deleusere(Serializable id) {

    }

    @Override
    public void updausere(User user) {

    }

    @Override
    public User geuserById(Serializable id) {
        return null;
    }

    @Override
    public List<User> lisuserAll() {
        return null;
    }

    @Override
    public List<User> lisuserPage(DetachedCriteria deuserachedCriusereria, int suseraruser, int end) {
        return null;
    }
}
