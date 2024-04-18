package com.descomplica.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.descomplica.projeto.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
