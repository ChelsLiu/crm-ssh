package test.com.newlyfly.crm_ssh.dao.impl;

import org.springframework.stereotype.Repository;
import test.com.newlyfly.crm_ssh.dao.DemoDao;

/**
 * Created by llf in 14:28 2017/10/2
 */
@Repository
public class DemoDaoImpl implements DemoDao {
    @Override
    public void say() {
        System.out.println("say Hello!");
    }
}
