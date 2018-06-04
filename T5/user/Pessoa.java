package user;

public abstract class Pessoa {
	private String usuario;
	private String senha;
	private String nome;
	private String endereco;
	private int documento;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(senha.equals(null) || senha == "") {
			System.out.println("A senha n�o pode ser vazio!");
		}else {
			this.senha = senha;			
		}		
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.equals(null) || endereco == "") {
			System.out.println("Endere�o n�o pode ser vazio!");
		}else {
			this.endereco = endereco;
		}
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		if(endereco.equals(null) || endereco == "") {
			System.out.println("Documento n�o pode ser vazio!");
		}else {
			this.documento = documento;
		}
	}
	
	public void setUsuario(String usuario) {
		if(usuario.equals(null) || usuario == "") {
			System.out.println("Usu�rio n�o pode ser vazio!");
		}else {
			this.usuario = usuario;
		}
	}
	
	public String getUsuario() {
		return usuario;
	}
	public String getNome() {
		return nome;
	}
	
	public abstract void menu();
}
