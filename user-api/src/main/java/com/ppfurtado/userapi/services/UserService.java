package com.ppfurtado.userapi.services;

import com.ppfurtado.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
