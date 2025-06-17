package com.streamvibe.api.models.filme;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Filme {
    
    private int id;
    private String nome;
    private String estudio;
    private double duracao;
    private String imagem;
    private String genero;
    private String diretor;
    private String elenco;
    private String sinopse;

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.estudio = dados.estudio();
        this.duracao = dados.duracao();
        this.imagem = dados.imagem();
        this.genero = dados.genero();
        this.diretor = dados.diretor();
        this.elenco = dados.elenco();
        this.sinopse = dados.sinopse();
    }



}
