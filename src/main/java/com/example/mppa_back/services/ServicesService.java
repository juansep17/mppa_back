package com.example.mppa_back.services;

import com.example.mppa_back.entities.Services;

import java.util.List;

public interface ServicesService {

    Services add(Services services);

    List<Services> list();
}