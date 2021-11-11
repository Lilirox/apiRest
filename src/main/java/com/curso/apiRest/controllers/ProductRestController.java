package com.curso.apiRest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.apiRest.entities.Cliente;
import com.curso.apiRest.entities.Empresa;
import com.curso.apiRest.entities.Product;
import com.curso.apiRest.repository.ClienteRepository;
import com.curso.apiRest.repository.EmpresaReposotiry;
import com.curso.apiRest.repository.ProductRepository;

@RestController
public class ProductRestController {

	@Autowired
	ProductRepository repository;
	
	@Autowired
	ClienteRepository clienteRepo;
	
	@Autowired
	EmpresaReposotiry empresaRepo;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);
	
	// PRODUCTS
	@RequestMapping(value="/products/", method=RequestMethod.GET)
	public List<Product> getProducts(){
		
		return repository.findAll();
	}
	
	@RequestMapping(value="/products/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		LOGGER.info("finding product by id: "+id);
		return repository.findById(id).get();
	}
	
	@RequestMapping(value="/products/", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
		
	}
	
	@RequestMapping(value="/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	
	//CLIENTES
	@RequestMapping(value="/clientes/", method=RequestMethod.GET)
	public List<Cliente> getCliente(){
		
		return clienteRepo.findAll();
	}
	
	@RequestMapping(value="/clientes/{id}", method = RequestMethod.GET)
	public Cliente getCliente(@PathVariable("id") int id) {
		LOGGER.info("finding cliente by id: "+id);
		return clienteRepo.findById(id).get();
	}
	
	@RequestMapping(value="/clientes/", method = RequestMethod.POST)
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteRepo.save(cliente);
	}
	
	@RequestMapping(value="/clientes/", method = RequestMethod.PUT)
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		return clienteRepo.save(cliente);
		
	}
	
	@RequestMapping(value="/clientes/{id}", method = RequestMethod.DELETE)
	public void deleteCliente(@PathVariable("id") int id) {
		clienteRepo.deleteById(id);
	}
	
	
	//EMPRESAS
	@RequestMapping(value="/empresas/", method=RequestMethod.GET)
	public List<Empresa> getEmpresas(){
		
		return empresaRepo.findAll();
	}
	
	@RequestMapping(value="/empresas/{id}", method = RequestMethod.GET)
	public Empresa getEmpresa(@PathVariable("id") int id) {
		LOGGER.info("finding empresa by id: "+id);
		return empresaRepo.findById(id).get();
	}
	
	@RequestMapping(value="/empresas/", method = RequestMethod.POST)
	public Empresa createEmpresa(@RequestBody Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	@RequestMapping(value="/empresas/", method = RequestMethod.PUT)
	public Empresa updateEmpresa(@RequestBody Empresa empresa) {
		return empresaRepo.save(empresa);
		
	}
	
	@RequestMapping(value="/empresas/{id}", method = RequestMethod.DELETE)
	public void deleteEmpresa(@PathVariable("id") int id) {
		empresaRepo.deleteById(id);
	}
}