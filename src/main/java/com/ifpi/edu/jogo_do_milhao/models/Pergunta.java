package com.ifpi.edu.jogo_do_milhao.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pergunta")
public class Pergunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enunciado;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pergunta")
    private List<Alternativas> alternativas;


    @Column(name = "resposta_correta")
    private int respostaCorreta; // Índice da resposta correta


    public Pergunta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public List<Alternativas> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Alternativas> alternativas) {
        this.alternativas = alternativas;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }
}
