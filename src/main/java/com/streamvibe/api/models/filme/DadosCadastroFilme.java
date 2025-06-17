package com.streamvibe.api.models.filme;

public record DadosCadastroFilme(
    String nome, 
    String estudio,
    double duracao,
    String imagem,
    String genero,
    String diretor,
    String elenco,
    String sinopse) {
    

}
