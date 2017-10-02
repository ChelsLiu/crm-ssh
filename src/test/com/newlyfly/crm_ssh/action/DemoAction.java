package test.com.newlyfly.crm_ssh.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import test.com.newlyfly.crm_ssh.service.DemoService;

/**
 * Created by llf in 14:32 2017/10/2
 */
@Controller
public class DemoAction {
    @Autowired
    private  DemoService demoService;

    public void say(){
        demoService.say();
    }

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        DemoService demoService = (DemoService) applicationContext.getBean("demoService");
//        demoService.say();
//
//        WebApplicationContext applicationContext1 = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//        applicationContext1.getBean()
    }
}
