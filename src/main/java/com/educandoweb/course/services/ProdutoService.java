package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Produto;
import com.educandoweb.course.repositories.ProdutoRepositorio;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepositorio repositorio;
	
	public List<Produto> findAll(){
		return repositorio.findAll();
	}
	
	public Produto findByAll(Long id) {
		Optional<Produto>obj = repositorio.findById(id);
		return obj.get();
	}
	
	
}
