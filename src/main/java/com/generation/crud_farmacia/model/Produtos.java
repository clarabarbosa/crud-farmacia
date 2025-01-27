package com.generation.crud_farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 03 e no máximo 100 caracteres")
	private String nome;
		
	@NotBlank(message = "O atributo tipo  é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo tipo deve conter no mínimo 05 e no máximo 100 caracteres")
	private String tipo;
	
	@NotBlank(message = "O atributo administração é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo administração deve conter no mínimo 05 e no máximo 100 caracteres")
	private String administracao;
	
	@NotBlank(message = "O atributo preço é obrigatório!") 
	@Size(min = 2, max = 100, message = "O atributo preço deve conter no mínimo 02 e no máximo 100 caracteres") 
	private String preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAdministracao() {
		return administracao;
	}

	public void setAdministracao(String administracao) {
		this.administracao = administracao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
}
