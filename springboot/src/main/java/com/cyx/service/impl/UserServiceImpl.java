package com.cyx.service.impl;

import com.cyx.dao.UserDao;
import com.cyx.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements com.cyx.service.UserService {
    @Autowired
    UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public User selectUser(String name, String password) {
        return userDao.selectUser(name, password);
    }
}
