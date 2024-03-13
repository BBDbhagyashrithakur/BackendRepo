package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.CompanyDTO;
import com.example.ATCProject.Service.Impl.UserServiceImpl;
import com.example.ATCProject.model.User_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @PostMapping("/register")
    public ResponseEntity<User_data>RegisterUser(@RequestBody User_data userData)
    {
        User_data user = userService.createUser(userData);
        return new ResponseEntity<>(user, HttpStatusCode.valueOf(200));

    }
    @GetMapping("/all")
    public ResponseEntity<List<CompanyDTO.UserDTO>>GetAllUser()
    {
        return  new ResponseEntity<>(new ArrayList<>(),HttpStatusCode.valueOf(200));
    }
    @GetMapping("/{id}")
    public  ResponseEntity<CompanyDTO.UserDTO>GetUserById(@PathVariable Long id )
    {
        return  new ResponseEntity<>(new CompanyDTO.UserDTO(),HttpStatusCode.valueOf(200));

    }
}
