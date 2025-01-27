package com.generation.crud_farmacia.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter no mínimo 03 e no máximo 100 caracteres")
	private String nome;
		
	@NotBlank(message = "O atributo setor é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo setor deve conter no mínimo 03 e no máximo 100 caracteres")
	private String setor;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produtos> produtos;

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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	
}
