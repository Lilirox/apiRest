package com.curso.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.apiRest.entities.Empresa;

public interface EmpresaReposotiry extends JpaRepository<Empresa, Integer> {

}
