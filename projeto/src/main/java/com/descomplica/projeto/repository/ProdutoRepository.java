package com.descomplica.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.descomplica.projeto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
    
}
