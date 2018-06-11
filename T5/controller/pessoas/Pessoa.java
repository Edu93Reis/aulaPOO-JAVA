package controller.pessoas;

public abstract class Pessoa {
	private String usuario, senha, nome, endere�o;
	private int documento;
	
	public Pessoa(String usuario, String senha, String nome, String endere�o, int documento) {
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.endere�o = endere�o;	
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

	public String getEndere�o() {
		return endere�o;
	}

	public int getDocumento() {
		return documento;
	}
	
	

}
