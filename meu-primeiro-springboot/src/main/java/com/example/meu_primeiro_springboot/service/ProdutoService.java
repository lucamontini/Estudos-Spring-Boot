package com.example.meu_primeiro_springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.meu_primeiro_springboot.model.Produto;
import com.example.meu_primeiro_springboot.repository.ProdutoRepository;

@Service
public class ProdutoService {
    // Atributos
    private final ProdutoRepository produtoRepository;

    // Construtor
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Métodos
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
