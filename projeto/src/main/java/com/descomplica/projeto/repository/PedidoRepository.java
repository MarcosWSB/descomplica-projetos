package com.descomplica.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.descomplica.projeto.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
    
}
