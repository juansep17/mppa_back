package com.example.mppa_back.controllers;

import com.example.mppa_back.entities.Users;
import com.example.mppa_back.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/list")
    public List<Users> list(){
        return usersService.list();
    }

    @PostMapping("/add")
    public Users add(@RequestBody Users users){
        return usersService.add(users);
    }
}
