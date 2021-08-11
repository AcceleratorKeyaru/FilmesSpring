package com.sith.filmesOnlineSith.service;

import com.sith.filmesOnlineSith.model.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findById(Long id);

    public User save(User user);

}
