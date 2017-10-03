package com.newlyfly.crm_ssh.action;

import com.newlyfly.crm_ssh.domain.Customer;
import com.newlyfly.crm_ssh.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by llf in 11:55 2017/9/28
 */
@Controller
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private Customer model = new Customer();
    @Override
    public Customer getModel() {
        return model;
    }

    @Autowired
    private CustomerService customerService;


    //去客户列表页面
    public String list() throws Exception {
        List<Customer> list = customerService.listAll();
        ActionContext.getContext().put("list",list);
        return SUCCESS;
    }

    //去新增客户页面
    public String toAdd() throws Exception {
        return "toAdd";
    }

    //添加客户
    public String add() throws Exception {
        customerService.save(model);
        return "add";
    }

    //删除客户
    public String delete() throws Exception {
        customerService.delete(model);
        return "delete";
    }

    //去修改客户信息页面
    public String toUpdate() throws Exception {
        //根据传过来的id先查询出当前对象
        Customer customer = customerService.getById(model.getCustId());
        //将对象放入request域
//        ServletActionContext.getRequest().setAttribute("customer",customer);
        ActionContext.getContext().put("customer",customer);
        return "toUpdate";
    }

    //编辑客户
    public String update() throws Exception {
        return "update";
    }
}
