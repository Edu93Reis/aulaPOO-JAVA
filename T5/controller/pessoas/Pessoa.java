package controller.pessoas;

public abstract class Pessoa {
	private String usuario, senha, nome, endereço;
	private int documento;
	
	public Pessoa(String usuario, String senha, String nome, String endereço, int documento) {
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.endereço = endereço;	
		this.documento = documento;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public int getDocumento() {
		return documento;
	}
	
	

}
