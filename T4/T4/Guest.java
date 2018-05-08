package T4;

public class Guest extends Usuario{
	public Guest(String login) {
		super(login);
	}
	
	public void despedida() {
		System.out.println("Até mais "+ super.login);
	}
	
	public void descreve() {
		System.out.println("Visitante possui permissões básicas de uso do sistema ..");
	}
	
}
