package T34;

import java.io.IOException;
import java.util.Scanner;

public class Root extends Usuario{
	private String login;
	
	public Root(String login) {
		super(login);
	}
	
	public void despedidaRoot() {
		System.out.println("Voc� est� encerrando a sse�o "+ super.login+" todos os usu�rios ativos ser�o encerrados automaticamente.");
	}
	
	public void descreveRoot() {
		System.out.println("Superusu�rio, possui o controle total do sistema");
	}
	
	public void excluirTodos() throws IOException {
		String op1;	
	    Scanner s = new Scanner(System.in);
		
		System.out.println("Deseja realmente apagar todos os usu�rios? [s/n]");
		op1 = s.nextLine();
		
		if(op1.toLowerCase().equals("s")) {
			System.out.println("Usu�rios deletados com sucesso!!");
		}else {
			System.out.println("Opera��o cancelada!!");
		}
		
		s.nextLine();
		
	}
}
