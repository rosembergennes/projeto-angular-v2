package com.example.meuproduto.servico_marca;
import java.util.List;

public interface MarcaService {

	List<Marca>listar();
	Marca listarId(int id);
	Marca add(Marca p);
	Marca edit(Marca p);
	Marca delete(int id);
	
	
	
}
