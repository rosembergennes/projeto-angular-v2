package com.example.meuproduto.servico_marca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/marca"})
public class Controlador {

	@Autowired
	MarcaService service;
	
	@GetMapping
	public List<Marca>listar(){
		return service.listar();
		
	}
}
