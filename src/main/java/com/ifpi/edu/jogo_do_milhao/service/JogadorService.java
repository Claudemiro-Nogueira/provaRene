package com.ifpi.edu.jogo_do_milhao.service;

import com.ifpi.edu.jogo_do_milhao.models.Jogador;
import com.ifpi.edu.jogo_do_milhao.repository.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JogadorService {
    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> findAll() {
        return jogadorRepository.findAll();

    }

}
