package T1;

public class Usuario {
	protected String login;
	protected String senha;
	
	protected Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	protected void boasVindas() {
		System.out.println("Bem-vindo " + login);
	}
	
	protected void despedida() {
	}
	
	public void despedida(Usuario usuario) {
		usuario.despedida();
	}
}
