package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.course.entities.Categoria;
import com.educandoweb.course.repositories.CategoriaRepositorio;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositorio repositorio;
	
	public List<Categoria> findAll(){
		return repositorio.findAll();		
	}
	
	public Categoria findById(Long Id) {
		Optional<Categoria>obj = repositorio.findById(Id);
		return obj.get();
	}
	

}
