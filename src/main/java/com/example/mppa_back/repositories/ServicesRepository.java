package com.example.mppa_back.repositories;

import com.example.mppa_back.entities.Services;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface ServicesRepository extends CrudRepository<Services, Integer> {

    Services save(Services services);

    List<Services> findAll();

    @Query("SELECT s FROM Services s WHERE s.servicesPK= ?1")
    Services findById(int id);

    @Transactional
    @Modifying
    @Query("DELETE FROM Services s WHERE s.servicesPK = ?1")
    void delete(int id);
}

