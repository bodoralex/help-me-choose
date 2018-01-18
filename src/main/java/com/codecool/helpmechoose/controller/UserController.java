package com.codecool.helpmechoose.controller;

import com.codecool.helpmechoose.model.User;
import com.codecool.helpmechoose.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/del/{id}")
    public void del(@PathVariable long id) {
        userRepository.delete(id);
    }

    @GetMapping(value = "/all")
    public List<User> findAll() {
        return iterableToList(userRepository.findAll());
    }

    @GetMapping(value = "/{name}")
    public User findByName(@PathVariable final String name) {
        return userRepository.findByName(name);
    }

    @PostMapping(value = "/load")
    public User load(@RequestBody final User user) {
        userRepository.save(user);
        return userRepository.findByName(user.getName());
    }

    private List<User> iterableToList(Iterable<User> iterable) {
        List<User> target = new ArrayList<>();
        iterable.forEach(target::add);
        return target;
    }
}

