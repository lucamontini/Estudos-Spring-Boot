package com.example.meu_primeiro_springboot.service;

import org.springframework.stereotype.Service;

import com.example.meu_primeiro_springboot.repository.MensagemRepository;

@Service
public class MensagemService {
    // Atributos
    private final MensagemRepository mensagemRepository;

    // Construtor
    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    // Método
    public String obterMensagem() {
        return mensagemRepository.obertMensagem();
    }

}
