package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.CompanyDTO;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/register")
    public ResponseEntity<CompanyDTO.UserDTO>RegisterUser(@RequestBody CompanyDTO.UserDTO userDTO)
    {
        return new ResponseEntity<>(new CompanyDTO.UserDTO(), HttpStatusCode.valueOf(200));

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
