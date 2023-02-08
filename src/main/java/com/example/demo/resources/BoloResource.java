package com.example.demo.resources;


import com.example.demo.Services.BoloService;
import com.example.demo.entities.Bolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/bolos")
public class BoloResource {

    @Autowired
    private BoloService boloService;

    @GetMapping
    public ResponseEntity<List<Bolo>> buscarTodos() {
        List<Bolo> todoMundo = boloService.buscarTodos();
        return ResponseEntity.ok().body(todoMundo);
    }

    @PostMapping
    @RequestMapping(value = "/criar")
    public ResponseEntity<Bolo> criarBolo(@RequestBody Bolo bolo) {
        Bolo boloCriado = boloService.salvar(bolo);
        return ResponseEntity.ok().body(boloCriado);
    }
}
