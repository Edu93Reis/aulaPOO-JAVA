package T4;

public class Usuario {
	protected String login;
	
	protected Usuario(String login) {
		this.login = login;
	}
	
	protected void boasVindas() {
		System.out.println("Bem-vindo " + login);
	}
	
	protected void descreve() {		
	}
	
	public void descreve(Usuario usuario) {
		usuario.descreve();
	}
	
	protected void despedida() {
	}
	
	public void despedida(Usuario usuario) {
		usuario.despedida();
	}
}