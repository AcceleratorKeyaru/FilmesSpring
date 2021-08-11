package com.sith.filmesOnlineSith.service.serviceImpl;


import com.sith.filmesOnlineSith.model.User;
import com.sith.filmesOnlineSith.repository.UserRepository;
import com.sith.filmesOnlineSith.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User save(User user) {

        User saved = userRepository.save(user);
        System.out.println(saved.getId());
        return saved;

    }
}
