package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.course.entities.Usuario;
import com.educandoweb.course.repositories.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	public List<Usuario> encontreTodos(){
		return repositorio.findAll();
	}
	
	public Usuario encontrePorid(Long Id) {
		Optional<Usuario> obj = repositorio.findById(Id);
		return obj.get();
	}

}
