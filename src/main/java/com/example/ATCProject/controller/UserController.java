package com.example.ATCProject.controller;

import com.example.ATCProject.model.UserDTO;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/register")
    public ResponseEntity<UserDTO>RegisterUser(@RequestBody UserDTO userDTO)
    {
        return new ResponseEntity<>(new UserDTO(), HttpStatusCode.valueOf(200));

    }
    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>>GetAllUser()
    {
        return  new ResponseEntity<>(new ArrayList<>(),HttpStatusCode.valueOf(200));
    }
    @GetMapping("/{id}")
    public  ResponseEntity<UserDTO>GetUserById(@PathVariable Long id )
    {
        return  new ResponseEntity<>(new UserDTO(),HttpStatusCode.valueOf(200));

    }
}
