package org.example.controller;

import org.example.Entity.Users;
import org.example.Exception.UserNotFoundException;
import org.example.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/create")
    public Users createUser(@RequestBody Users users) {
        return userService.createUser(users);
    }

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserId(@PathVariable int id) {
        try {
            Users users = userService.getUserById(id);
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }
}
