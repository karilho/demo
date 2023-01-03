package com.example.demo.resources;


import com.example.demo.Services.BoloService;
import com.example.demo.entities.Bolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




/*
    EXISTEM 4 TIPOS

    C - CREATE - CRIA A INFORMAÇÃO NO DB - POST
    R - READ - EXIBE A INFORMAÇÃO DO DB - GET
    U - UPDATE - ATUALIZA A INFORMAÇÃO - PUT
    D - DELETE - DELETA A INFORMAÇÃO  - DELETE
*/

}
