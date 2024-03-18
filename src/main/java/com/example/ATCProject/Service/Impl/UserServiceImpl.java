package com.example.ATCProject.Service.Impl;


import com.example.ATCProject.DTO.UserDTO;
import com.example.ATCProject.Entity.College;
import com.example.ATCProject.Entity.Users;
import com.example.ATCProject.Exception.CollegeNotFoundException;
import com.example.ATCProject.Exception.UserNotFoundException;
import com.example.ATCProject.Repository.CollageRepo;
import com.example.ATCProject.Repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CollageRepo collegeRepository;

    public UserDTO createUser(UserDTO userDTO) {
        System.out.println(userDTO);
        Users user = Users.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .mobilenumber(userDTO.getMobilenumber())
                .role(userDTO.getRole())
                .build();
        College college = collegeRepository.findById(userDTO.getCollegeId())
                .orElseThrow(() -> new CollegeNotFoundException("College not found with ID: " + userDTO.getCollegeId()));
        user.setCollege(college);
        if (college != null) {
            user.setCollege(college);
            userRepository.save(user);
            return userDTO;
        }
        return null;
    }
    public List<UserDTO> getAllUsers() {
        List<Users> users = userRepository.findAll();
        List<UserDTO> userDTOS=new ArrayList<>();
        for(Users u :users){
            userDTOS.add(modelMapper.map(u,UserDTO.class));

        }

        return userDTOS;
    }
    public UserDTO getUserById(int id) {
        Optional<Users> byId= userRepository.findById(id);
        if(byId.isEmpty()){
          //  System.out.println("user is not exits");
            throw new UserNotFoundException("User not found with ID: " + id);        }
        return  modelMapper.map(byId.get(),UserDTO.class);

    }
    public String deleteUser(int id) {
        Optional<Users> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new UserNotFoundException("User not found with ID: " + id);
        }
        userRepository.deleteById(id);
        return "User deleted successfully";
    }
}
