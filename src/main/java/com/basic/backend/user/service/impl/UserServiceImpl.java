package com.basic.backend.user.service.impl;

import com.basic.backend.user.domain.User;
import com.basic.backend.user.repository.UserRepository;
import com.basic.backend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
