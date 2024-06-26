package com.ada.blogappnosql.service.impl;


import com.ada.blogappnosql.repository.UserRepository;
import com.ada.blogappnosql.repository.entity.User;
import com.ada.blogappnosql.service.IUserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService implements IUserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
