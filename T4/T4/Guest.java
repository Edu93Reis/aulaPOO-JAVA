package T4;

public class Guest extends Usuario{
	public Guest(String login) {
		super(login);
	}
	
	public void despedida() {
		System.out.println("At� mais "+ super.login);
	}
	
	public void descreve() {
		System.out.println("Visitante possui permiss�es b�sicas de uso do sistema ..");
	}
	
}
