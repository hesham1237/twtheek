package com.example.Twtheek.Controllar;

import com.example.Twtheek.Model.User;
import com.example.Twtheek.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserControllar {
    @Autowired
    private ServiceUser serviceUser;


    @PostMapping(value = "/addUser")
    public User addCourse(@RequestBody User user) {

        return serviceUser.addUser(user);
    }

    @GetMapping(value = "/getUser")
    public List<User> getUser() {
        return serviceUser.getUser();
    }
    @DeleteMapping(value = "/{national_Id}")
    public String deleteUserint(@PathVariable("national_Id") int id) {
        serviceUser.deleteUserint(id);
        return "Is Deleted Successfully!!";
    }

}
