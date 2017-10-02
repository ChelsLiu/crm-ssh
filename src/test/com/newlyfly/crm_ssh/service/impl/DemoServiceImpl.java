package test.com.newlyfly.crm_ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.com.newlyfly.crm_ssh.dao.DemoDao;
import test.com.newlyfly.crm_ssh.service.DemoService;

/**
 * Created by llf in 14:30 2017/10/2
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public void say() {
        demoDao.say();
    }
}
