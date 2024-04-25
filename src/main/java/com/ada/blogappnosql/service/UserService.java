package com.ada.blogappnosql.service;


import com.ada.blogappnosql.repository.UserRepository;
import com.ada.blogappnosql.repository.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    {}  public void saveUser(User user) {
        userRepository.save(user);
    }

}
