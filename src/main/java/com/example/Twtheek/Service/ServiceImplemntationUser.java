package com.example.Twtheek.Service;

import com.example.Twtheek.Model.User;
import com.example.Twtheek.Repositry.Repositry_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplemntationUser implements ServiceUser {
    @Autowired
    private Repositry_user reUser;

    @Override
    public User addUser(User user) {

        return reUser.save(user);
    }

    @Override
    public List<User> getUser() {
        return reUser.findAll();
    }
    @Override
    public void deleteUserint(int id) {
        reUser.deleteById(id);

    }
}

