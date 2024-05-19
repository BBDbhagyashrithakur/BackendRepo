        package com.jobportal.Service;


import com.jobportal.Entity.Users;

import java.util.List;

        public interface UserService {

    Users registerUser(Users user);

    Users getUserById(int id);

            List<Users> getAllUsers();

            String deleteUser(int id);

            Users createUser(Users users);
//
//            boolean addUser(Users user);
//
//            List<Users> getEmailId(String emailId);
//
//            List<Users> getUserByEmail(String emailId);
        }
