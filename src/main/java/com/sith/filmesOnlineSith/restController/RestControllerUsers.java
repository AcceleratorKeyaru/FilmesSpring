package com.sith.filmesOnlineSith.restController;

import com.sith.filmesOnlineSith.model.User;
import com.sith.filmesOnlineSith.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllerUsers {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        System.out.println(user.getNome());
        return userService.save(user);
    }


}
