package com.ifrs.edu.restinga.segundoController;

public class Pessoa {

	private String nome;
	private int idade;
	private String email;
	private String[] telefones;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getTelefones() {
		return telefones;
	}
	public void setTelefones(String[] telefones) {
		this.telefones = telefones;
	}

}
