package com.example.mppa_back.repositories;

import com.example.mppa_back.entities.Services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesRepository extends CrudRepository<Services, Integer> {

    Services save(Services services);

    List<Services> findAll();
}

