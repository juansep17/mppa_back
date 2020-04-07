package com.example.mppa_back.services.impl;

import com.example.mppa_back.entities.Services;
import com.example.mppa_back.exception.ResourceNotFoundException;
import com.example.mppa_back.repositories.ServicesRepository;
import com.example.mppa_back.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesImpl implements ServicesService {

    @Autowired
    ServicesRepository servicesRepository;

    @Override
    public Services add(Services services) {
        return servicesRepository.save(services);
    }

    @Override
    public List<Services> list() {
        return servicesRepository.findAll();
    }

    @Override
    public Services edit(Services services) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Services findById(int id) {
        return servicesRepository.findById(id);
    }

    @Override
    public void remove(Services services) throws ResourceNotFoundException {

    }



}
