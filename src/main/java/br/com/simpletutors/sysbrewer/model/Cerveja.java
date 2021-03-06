package br.com.simpletutors.sysbrewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	
	@NotBlank(message ="sku obrigatorio")	
	private String sku;
	
	@NotBlank(message = "nome obrigatorio")
	private String nome;
	
	@Size(min = 10, max = 50, message ="deve esta entre 10 e 50")
	private String descricao;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}