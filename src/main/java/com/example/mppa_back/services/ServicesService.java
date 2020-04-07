package com.example.mppa_back.services;

import com.example.mppa_back.entities.Services;
import com.example.mppa_back.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface ServicesService {

    Services add(Services services);

    List<Services> list();

    Services edit(Services services) throws ResourceNotFoundException;

    Services findById(int id);

    void remove (Services services) throws ResourceNotFoundException;
}