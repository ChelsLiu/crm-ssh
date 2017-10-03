package com.newlyfly.crm_ssh.dao;

import com.newlyfly.crm_ssh.domain.User;

import java.util.List;

/**
 * Created by llf in 11:53 2017/9/28
 */
public interface UserDao extends BaseDao<User>{
    // 根据用户名和密码查询用户
    User getUserByUserNameAndPassword(String userName, String password);

    // 根据用户名查询单条用户
    User getUserByUserName(String userName);

}
