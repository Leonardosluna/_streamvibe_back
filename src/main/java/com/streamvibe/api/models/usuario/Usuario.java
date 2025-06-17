package com.streamvibe.api.models.usuario;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class Usuario {

    private int id;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;
    
    
}
