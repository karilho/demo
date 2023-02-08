package com.example.demo.Repositories;

import com.example.demo.entities.Bolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoloRepository extends JpaRepository<Bolo, Integer> {

}

