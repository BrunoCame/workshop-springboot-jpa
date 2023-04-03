package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.course.entities.Pedido;
import com.educandoweb.course.repositories.PedidoRepositorio;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepositorio repositorio;
	
	public List<Pedido> procurarTodos() {
		return repositorio.findAll();		
	}
	
	public Pedido procurarPorId(Long Id) {
		Optional<Pedido> obj = repositorio.findById(Id);
		return obj.get();
	}
	


}
