package controller.pessoas;

public abstract class Pessoa {
	private String usuario, senha, nome, enderešo;
	private int documento;
	
	public Pessoa(String usuario, String senha, String nome, String enderešo, int documento) {
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.enderešo = enderešo;	
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

	public String getEnderešo() {
		return enderešo;
	}

	public int getDocumento() {
		return documento;
	}
	
	

}
