package com.ifpi.edu.jogo_do_milhao.service;

import com.ifpi.edu.jogo_do_milhao.models.Pergunta;

import com.ifpi.edu.jogo_do_milhao.repository.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class PerguntaService {
    @Autowired
    private PerguntaRepository perguntaRepository;

    public PerguntaService(PerguntaRepository perguntaRepository) {
        this.perguntaRepository = perguntaRepository;
    }

    public Pergunta getPerguntaAleatoria() {
        List<Pergunta> perguntas = perguntaRepository.findAll();
        return perguntas.get(new Random().nextInt(perguntas.size()));
    }

    public Pergunta getPerguntaById(Long id) {
        // Usando findById que retorna Optional
        Optional<Pergunta> pergunta = perguntaRepository.findById(id);

        // Se a pergunta existir, retornamos ela, caso contrário, retornamos null ou podemos lançar uma exceção
        return pergunta.orElse(null); // Ou lançar uma exceção caso prefira
    }

    public List<Pergunta> listarPerguntas() {
        List<Pergunta> perguntas = perguntaRepository.findAll();
        return perguntas;
    }



}
