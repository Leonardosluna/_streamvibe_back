package com.streamvibe.api.models.usuario;

public record DadosCadastroUsuario(
    String nome,
    String dataNascimentos,
    String email,
    String senha,
    String cpf) {
    
}
