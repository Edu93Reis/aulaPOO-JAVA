package T1;

import java.util.Scanner;

public class Admin extends Usuario{
	private static String senha = "1234@Admin";
			
	public Admin(String login) {
		super(login, senha);
	}
	
	public void despedida() {
		System.out.println("Voc� est� encerrando a sess�o "+ super.login+" , todos os usu�rios ativos ser�o encerrados automaticamente.");
	}
	
	public void acao() {
		Menu m = new Menu();
		m.menu();
	}
}
