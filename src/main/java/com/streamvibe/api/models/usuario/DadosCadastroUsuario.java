package com.streamvibe.api.models.usuario;

import com.streamvibe.api.models.endereco.DadosCadastroEndereco;


public record DadosCadastroUsuario(
    String nome,
    String dataNascimentos,
    String email,
    String senha,
    String cpf,
    DadosCadastroEndereco endereco
    ) {
    
}
