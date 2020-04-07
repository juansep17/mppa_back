package com.example.mppa_back.services.impl;

import com.example.mppa_back.entities.Users;
import com.example.mppa_back.repositories.UsersRepository;
import com.example.mppa_back.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Users add(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public List<Users> list() {
        return usersRepository.findAll();
    }
}
