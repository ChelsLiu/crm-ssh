package com.newlyfly.crm_ssh.action;

import com.newlyfly.crm_ssh.domain.User;
import com.newlyfly.crm_ssh.service.UserService;
import com.newlyfly.crm_ssh.util.MD5Utils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by llf in 15:04 2017/10/1
 */
@Controller
public class LoginAction extends ActionSupport implements ModelDriven<User>{
    private User model = new User();
    @Override
    public User getModel() {
        return model;
    }

    @Autowired
    private UserService userService;

    private String msg;

    public String login() throws Exception {
        //根据登录信息
//        User user = userService.getUserByUserNameAndPassword(model.getUserName(), model.getPassword());
        User user = userService.getUserByUserName(model.getUserName());

        if (!StringUtils.isNotBlank(model.getUserName())){
            msg = "用户名不能为空！";
        } else if (user == null){
            msg = "用户不存在！";
        } else if (!StringUtils.isNotBlank(model.getPassword())){
            msg = "密码不能为空！";
        } else if (!MD5Utils.md5(model.getPassword()).equals(user.getPassword())){
            msg = "密码错误！";
        } else {
            ActionContext.getContext().getSession().put("user",user);
            return SUCCESS;
        }
        return ERROR;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
