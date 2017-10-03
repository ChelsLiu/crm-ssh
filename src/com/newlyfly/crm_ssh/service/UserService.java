package com.newlyfly.crm_ssh.service;

import com.newlyfly.crm_ssh.domain.User;

/**
 * Creausered by llf in 11:55 2017/9/28
 */
public interface UserService {
    // 根据用户名和密码查询用户
    User getUserByUserNameAndPassword(String userName, String password);

    // 根据用户名查询单条用户
    User getUserByUserName(String userName);

    // 新增一个用于测试的用户
//    void save(User user);
}
