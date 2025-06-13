package com.streamvibe.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmesController {

    @PostMapping("/cadastrar")
public void cadastrarFilme(@RequestBody String dados){
        System.out.println(dados);
    }

    
}
