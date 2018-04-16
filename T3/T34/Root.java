package T34;

import java.io.IOException;
import java.util.Scanner;

public class Root extends Usuario{
	private String login;
	
	public Root(String login) {
		super(login);
	}
	
	public void despedidaRoot() {
		System.out.println("Você está encerrando a sseão "+ super.login+" todos os usuários ativos serão encerrados automaticamente.");
	}
	
	public void descreveRoot() {
		System.out.println("Superusuário, possui o controle total do sistema");
	}
	
	public void excluirTodos() throws IOException {
		String op1;	
	    Scanner s = new Scanner(System.in);
		
		System.out.println("Deseja realmente apagar todos os usuários? [s/n]");
		op1 = s.nextLine();
		
		if(op1.toLowerCase().equals("s")) {
			System.out.println("Usuários deletados com sucesso!!");
		}else {
			System.out.println("Operação cancelada!!");
		}
		
		s.nextLine();
		
	}
}
