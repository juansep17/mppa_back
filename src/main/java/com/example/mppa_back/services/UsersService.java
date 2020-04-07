package com.example.mppa_back.services;

import com.example.mppa_back.entities.Users;

import java.util.List;

public interface UsersService {
    Users add(Users users);

    List<Users> list();
}
