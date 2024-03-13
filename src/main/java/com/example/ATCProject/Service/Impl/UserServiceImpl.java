package com.example.ATCProject.Service.Impl;


import com.example.ATCProject.Repository.UserRepository;
import com.example.ATCProject.model.User_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
    public User_data createUser(User_data userData){
        User_data byUserEmail = userRepository.Email(userData.getEmail());
        if(byUserEmail!=null){
            System.out.println("user alredy exit");
            return  null;
        }
        return userRepository.save(userData);

}
}
