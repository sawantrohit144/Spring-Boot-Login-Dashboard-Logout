package com.login.SYSLogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.SYSLogin.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

