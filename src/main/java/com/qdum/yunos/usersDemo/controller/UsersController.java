package com.qdum.yunos.usersDemo.controller;

import com.qdum.yunos.usersDemo.model.User;
import com.qdum.yunos.usersDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author taven
 * @date 18/3/3
 *
 */
@Controller
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public void showUser(@RequestParam("id") String id, ModelMap modelMap) {
        //1.调用BLL层的服务接口
        User user = userService.getUser(id);
        //2.设置模型数据
        modelMap.put("user",user);
    }

}
