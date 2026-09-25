package com.example.meu_primeiro_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meu_primeiro_springboot.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
