package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.course.entities.Usuario;
import com.educandoweb.course.repositories.UsuarioRepositorio;
import com.educandoweb.course.resourcesNotFoundExcpetion.ResourceNaoAchaExcessao;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepositorio repositorio;

	public List<Usuario> encontreTodos(){
		return repositorio.findAll();
	}
	
	public Usuario encontrePorId(Long id) {
		Optional<Usuario>obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ResourceNaoAchaExcessao(id));
	}
	
	public Usuario inserir(Usuario obj) {
		return repositorio.save(obj);
	}
	
	
	public void delete(Long id) {
		repositorio.deleteById(id);
	}
	
	public Usuario update(Long id, Usuario obj) {
		Usuario entity = repositorio.getReferenceById(id);
		updateDados(entity, obj);
		return repositorio.save(entity);
	}

	private void updateDados(Usuario entity, Usuario obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setTelefone(obj.getTelefone());	
	}
	
}
