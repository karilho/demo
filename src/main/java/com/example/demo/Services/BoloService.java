package com.example.demo.Services;

import com.example.demo.Repositories.BoloRepository;
import com.example.demo.entities.Bolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoloService {
    @Autowired
    private BoloRepository boloRepository;

    public List<Bolo> buscarTodos() {
        return boloRepository.findAll();
    }

    public Bolo createBolo(Bolo bolo) {
        return boloRepository.save(bolo);

    }
}
