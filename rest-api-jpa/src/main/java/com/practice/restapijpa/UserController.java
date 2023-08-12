package com.practice.restapijpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "get_users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    @GetMapping(value = "/get_user")
    public User getUser(@RequestParam("id") int id){
        return userRepository.getUserById(id);
    }

    @PostMapping(value = "/insert_user")
    public void addUser(@RequestBody User user){
        userRepository.save(user);

    }
    @GetMapping(value = "/user_by_country/{country}")
    public List<User> getUserByCountry(@PathVariable(value = "country") String country){
       return userRepository.findByCountry(country);
    }
}
