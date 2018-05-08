package T4;

import java.util.Scanner;

public class Group extends Usuario {
	
	public Group(String login) {
		super(login);
	}

	public void despedida() {
		System.out.println("A sessão está sendo encerrada .. ");
	}
	
	public void descreve() {
		System.out.println("Grupo permite o uso por grupo de usuários ..");
	}
	
	public void groupBoard() {
	    String op;	
		
	    Scanner s = new Scanner(System.in);
	    
	    do {
			
	    	System.out.println("Ao apagar o grupo você apagará todos os usuários contidos nele, deseja prosseguir? [s/n]");
			op = s.nextLine();
			
			if(!(op.toLowerCase().equals("s") || op.toLowerCase().equals("n"))) {
				System.out.println("Entrada inválida, digite [s] para sim ou [n] para não ..");
			}
				
	    }while(!(op.toLowerCase().equals("s") || op.toLowerCase().equals("n")));
		
		if(op.toLowerCase().equals("s")) {
			System.out.println("Grupo deletado com sucesso!!");
		}else {
			System.out.println("Operação cancelada!!");
		}
		
		s.nextLine();
	}
}