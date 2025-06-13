package com.streamvibe.api.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class Usuario {

    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;
    
    
}
