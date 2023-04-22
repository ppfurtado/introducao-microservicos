package com.ppfurtado.userapi.services.impl;

import com.ppfurtado.userapi.domain.User;
import com.ppfurtado.userapi.repositories.UserRepository;
import com.ppfurtado.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
