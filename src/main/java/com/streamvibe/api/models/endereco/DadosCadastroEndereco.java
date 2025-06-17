package com.streamvibe.api.models.endereco;

public record DadosCadastroEndereco(
    String rua,
    String numero,
    String bairro,
    String cep,
    String cidade,
    String complemento) {
    
}
