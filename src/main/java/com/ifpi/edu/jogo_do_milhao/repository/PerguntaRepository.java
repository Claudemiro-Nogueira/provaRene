package com.ifpi.edu.jogo_do_milhao.repository;

import com.ifpi.edu.jogo_do_milhao.models.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {

    Pergunta getPerguntaById(Long id);

}


