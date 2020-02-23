package com.example.meuproduto.servico_marca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MarcaServiceImp implements MarcaService {

	@Autowired
	private MarcaRepositorio repositorio;
	
	
	@Override
	public List<Marca> listar() {
		// utilizo a variavel repositorio passando findAll
		return repositorio.findAll();
	}

	@Override
	public Marca listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marca add(Marca p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marca edit(Marca p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marca delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
