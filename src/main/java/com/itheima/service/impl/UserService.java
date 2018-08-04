package com.itheima.service.impl;

import com.itheima.dao.IUserDao;
import com.itheima.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements com.itheima.service.UserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public void addUser(Users users) {
        userDao.addUser(users);
    }
}
