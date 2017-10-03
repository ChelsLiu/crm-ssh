package com.newlyfly.crm_ssh.service;

import com.newlyfly.crm_ssh.domain.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by llf in 11:55 2017/9/28
 */
public interface CustomerService {
    // 查询所有客户
    List<Customer> listAll();
    // 添加客户
    void save(Customer customer);
    // 删除客户
    void delete(Customer customer);
    // 查询单个客户
    Customer getById(Serializable id);
}
