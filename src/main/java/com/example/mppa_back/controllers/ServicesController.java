package com.example.mppa_back.controllers;

import com.example.mppa_back.entities.Services;
import com.example.mppa_back.exception.ResourceNotFoundException;
import com.example.mppa_back.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/services")
public class ServicesController {

    @Autowired
    ServicesService servicesService;

    @GetMapping("/list")
    public List<Services> list(){
        return servicesService.list();
    }

    @GetMapping("/findById")
    public Services findById(@RequestParam int id){
        return servicesService.findById(id);
    }

    @PostMapping("/add")
    public Services add(@RequestBody Services services){
        return servicesService.add(services);
    }


    @PutMapping("/edit")
    public Services edit(@RequestParam Services services) throws ResourceNotFoundException {
        return servicesService.edit(services);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) throws ResourceNotFoundException {
        servicesService.remove(id);
        }
}
