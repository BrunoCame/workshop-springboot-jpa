package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
	
}
