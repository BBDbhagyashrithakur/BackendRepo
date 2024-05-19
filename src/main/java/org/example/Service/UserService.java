        package org.example.Service;


import org.example.Entity.Users;

import java.util.List;

        public interface UserService {

    Users registerUser(Users user);

    Users getUserById(int id);

            List<Users> getAllUsers();

            String deleteUser(int id);

            Users createUser(Users users);
        }
