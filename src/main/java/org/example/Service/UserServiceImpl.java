package org.example.Service;
import org.example.Entity.Users;
import org.example.Exception.UserNotFoundException;
import org.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Users registerUser(Users user) {
        // Additional validation logic can be added here
        return userDao.save(user);
    }

    @Override
    public Users getUserById(int id) {
        return userDao.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found"));
    }

    @Override
    public List<Users> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public String deleteUser(int id) {
        if (!userDao.existsById(id)) {
            throw new UserNotFoundException("User with id " + id + " not found");
        }
        userDao.deleteById(id);
        return null;
    }

    @Override
    public Users createUser(Users users) {
        return null;
    }

}




