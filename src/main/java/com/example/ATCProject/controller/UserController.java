package com.example.ATCProject.controller;
import com.example.ATCProject.DTO.UserDTO;
import com.example.ATCProject.Repository.UserRepository;
import com.example.ATCProject.Service.Impl.UserServiceImpl;
import com.example.ATCProject.model.User_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;
    @PostMapping("/register")
    public ResponseEntity<User_data>RegisterUser(@RequestBody User_data userData)
    {
        User_data user = userService.createUser(userData);
        return new ResponseEntity<>(user, HttpStatusCode.valueOf(200));

    }
    @GetMapping("/all")
    public ResponseEntity<List<User_data>>GetAllUser()
    {   List<User_data> users =userRepository.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User_data> getUserById(@PathVariable Long id) {
        Optional<User_data> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User_data user = userOptional.get();
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
