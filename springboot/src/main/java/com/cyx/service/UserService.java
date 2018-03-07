package com.cyx.service;

import com.cyx.domain.User;

public interface UserService {
    int insertUser(User user);

    User selectUser(String name, String password);
}
