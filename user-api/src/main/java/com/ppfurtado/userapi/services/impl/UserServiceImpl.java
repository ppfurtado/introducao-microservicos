package com.ppfurtado.userapi.services.impl;

import com.ppfurtado.userapi.domain.User;
import com.ppfurtado.userapi.repositories.UserRepository;
import com.ppfurtado.userapi.services.UserService;
import com.ppfurtado.userapi.services.excpetions.ObjectNotFoundExcpetion;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final Environment env;
    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get Request on " + env.getProperty("local.server.port")+" port");
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundExcpetion("User not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
