package com.example.meu_primeiro_springboot.exceptions;

public class RecursoNaoEncontradoException extends RuntimeException {
    // Construtor
    public RecursoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

}
