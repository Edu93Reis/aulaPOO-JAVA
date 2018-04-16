package T34;

import java.io.IOException;
import java.util.Scanner;

public class Group extends Usuario {
	private String login;
	
	public Group(String login) {
		super(login);
	}

	public void despedidaGroup() {
		System.out.println("A sessão está sendo encerrada .. ");
	}
	
	public void descreveGroup() {
		System.out.println("Grupo permite o uso por grupo de usuários ..");
	}
	
	public void groupBoard() throws IOException {
	    String op;	
		
	    Scanner s = new Scanner(System.in);
	    
		System.out.println("Ao apagar o grupo você apagará todos os usuários contidos nele, deseja prosseguir? [s/n]");
		op = s.nextLine();
		
		if(op.toLowerCase().equals("s")) {
			System.out.println("Grupo deletado com sucesso!!");
		}else {
			System.out.println("Operação cancelada!!");
		}
		
		s.nextLine();
	}
}
