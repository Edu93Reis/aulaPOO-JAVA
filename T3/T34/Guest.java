package T34;

public class Guest extends Usuario{
	private String login;	
	
	public Guest(String login) {
		super(login);
	}
	
	public void despedidaGuest() {
		System.out.println("At� mais "+ super.login);
	}
	
	public void descreveGuest() {
		System.out.println("Visitante possui permiss�es b�sicas de uso do sistema ..");
	}
	
}
