package com.curso.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.apiRest.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	

}
