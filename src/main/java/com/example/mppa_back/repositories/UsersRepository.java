package com.example.mppa_back.repositories;

import com.example.mppa_back.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
    Users save(Users users);

    List<Users> findAll();
}
