package com.newlyfly.crm_ssh.dao.impl;

import com.newlyfly.crm_ssh.dao.CustomerDao;
import com.newlyfly.crm_ssh.domain.Customer;
import com.newlyfly.crm_ssh.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by llf in 11:54 2017/9/28
 */
@Repository
public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao {

}
