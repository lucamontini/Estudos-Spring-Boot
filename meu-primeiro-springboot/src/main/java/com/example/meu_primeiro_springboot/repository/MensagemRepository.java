package com.example.meu_primeiro_springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    // Método
    public String obertMensagem() {
        return "Olá do repositório";
    }
}
