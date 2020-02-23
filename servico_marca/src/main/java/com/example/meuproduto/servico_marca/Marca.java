package com.example.meuproduto.servico_marca;

import javax.persistence.*;

@Entity
@Table(name ="tb_marca_produto")

public class Marca {
	
	 @Id
	    @Column
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @Column 
	    private String nome;
	    private String site;
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSite() {
			return site;
		}
		public void setSite(String site) {
			this.site = site;
		}
	    
  
}
