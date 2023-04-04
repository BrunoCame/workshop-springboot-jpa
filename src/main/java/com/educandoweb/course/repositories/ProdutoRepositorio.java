package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
