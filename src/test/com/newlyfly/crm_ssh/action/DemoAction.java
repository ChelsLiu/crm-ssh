package test.com.newlyfly.crm_ssh.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import test.com.newlyfly.crm_ssh.service.DemoService;

/**
 * Created by llf in 14:32 2017/10/2
 */
@Controller
public class DemoAction {
    @Autowired
    private DemoService demoService;

    public void say(){
        demoService.say();
    }

    public static void main(String[] args) {

    }
}
