package com.newlyfly.crm_ssh.service.impl;

import com.newlyfly.crm_ssh.dao.CustomerDao;
import com.newlyfly.crm_ssh.dao.impl.CustomerDaoImpl;
import com.newlyfly.crm_ssh.domain.Customer;
import com.newlyfly.crm_ssh.service.CustomerService;
import com.newlyfly.crm_ssh.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> listAll() {
        return  customerDao.listAll();
    }

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public Customer getById(Serializable id) {
        return customerDao.getById(id);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }
}
