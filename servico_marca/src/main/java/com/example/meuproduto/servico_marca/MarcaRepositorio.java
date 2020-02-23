package com.example.meuproduto.servico_marca;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface MarcaRepositorio extends Repository<Marca, Integer> {
	List<Marca>findAll();
	Marca findOne (int id);
	Marca save(Marca p);
	void delete(Marca p);

}
