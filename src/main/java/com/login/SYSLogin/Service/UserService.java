package com.login.SYSLogin.Service;

import com.login.SYSLogin.Entity.User;

public interface UserService {
    User findByUsername(String username);
}
