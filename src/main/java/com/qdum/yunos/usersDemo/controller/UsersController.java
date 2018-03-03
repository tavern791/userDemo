package com.qdum.yunos.usersDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author taven
 * @date 18/3/3
 *
 */
@Controller
public class UsersController {

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public void showUser(HttpServletResponse response) throws IOException {
        response.getWriter().print("<h1>Hello SpringMVC</h1>");
        response.flushBuffer();
    }

}
