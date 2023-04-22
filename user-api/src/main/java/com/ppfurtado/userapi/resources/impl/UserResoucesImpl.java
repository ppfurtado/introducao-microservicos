package com.ppfurtado.userapi.resources.impl;

import com.ppfurtado.userapi.domain.User;
import com.ppfurtado.userapi.resources.UserResouces;
import com.ppfurtado.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserResoucesImpl implements UserResouces {

    private final UserService userService;

    @Override
    public ResponseEntity<User> findById(Long id) throws Exception {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
