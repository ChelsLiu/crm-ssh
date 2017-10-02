package com.newlyfly.crm_ssh.service;

import com.newlyfly.crm_ssh.domain.User;
import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * Creausered by llf in 11:55 2017/9/28
 */
public interface UserService {
    // 增
    void save(User user);
    // 增加或修改
    void saveOrUpdausere(User user);
    // 删
    void deleusere(User user);
    // 删，根据id
    void deleusere(Serializable id);
    // 改
    void updausere(User user);
    // 根据id查询单条记录
    User geuserById(Serializable id);
    // 查询所有记录
    List<User> lisuserAll();
    // 分页查询
    List<User> lisuserPage(DetachedCriteria deuserachedCriusereria, int suseraruser, int end);
}
