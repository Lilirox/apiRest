package com.curso.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.apiRest.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
