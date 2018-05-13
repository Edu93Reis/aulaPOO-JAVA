package T1;

import java.util.Scanner;

public class Admin extends Usuario{
	private static String senha = "1234@Admin";
			
	public Admin(String login) {
		super(login, senha);
	}
	
	public void despedida() {
		System.out.println("Você está encerrando a sessão "+ super.login+" , todos os usuários ativos serão encerrados automaticamente.");
	}
	
	public void acao() {
		Menu m = new Menu();
		m.menu();
	}
}
