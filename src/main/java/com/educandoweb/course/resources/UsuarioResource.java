package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

@GetMapping
public ResponseEntity<Usuario> acharTodos(){
	Usuario u = new Usuario(1L, "Bruno", "brunocabral9@hotmail.com", "95596118", "12345");
	return ResponseEntity.ok().body(u);	
}

}
