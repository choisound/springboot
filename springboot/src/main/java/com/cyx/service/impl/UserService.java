package com.cyx.service.impl;

import com.cyx.dao.UserMapper;
import com.cyx.domain.User;
import com.cyx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
