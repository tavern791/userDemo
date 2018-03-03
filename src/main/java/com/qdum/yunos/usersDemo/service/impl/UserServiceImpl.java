package com.qdum.yunos.usersDemo.service.impl;

import com.qdum.yunos.usersDemo.mapper.UserMapper;
import com.qdum.yunos.usersDemo.model.User;
import com.qdum.yunos.usersDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by taven on 18/3/4.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String userId) {
        return this.userMapper.getUser(userId);
    }
}
