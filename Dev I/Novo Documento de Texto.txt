package modelo;

public class Cliente {

	public Cliente(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	
	// verificar se esta ativo 
	public boolean estaAtivo() {
		return ativo;
	}
		
	//ativar 
	public void ativar() {
		this.ativo = true; 
	}
	
	
	
	
	
}