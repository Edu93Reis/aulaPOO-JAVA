package T4;

import java.util.Scanner;

public class Root extends Usuario{	
	public Root(String login) {
		super(login);
	}
	
	public void despedida() {
		System.out.println("Você está encerrando a sessão "+ super.login+" , todos os usuários ativos serão encerrados automaticamente.");
	}
	
	public void descreve() {
		System.out.println("Superusuário, possui o controle total do sistema");
	}
	
	public void excluirTodos() {
		String op1;	
	    Scanner s = new Scanner(System.in);
		
	    do {
			System.out.println("Deseja realmente apagar todos os usuários? [s/n]");
			op1 = s.nextLine();
			if(!(op1.toLowerCase().equals("s") || op1.toLowerCase().equals("n"))) {
				System.out.println("Entrada inválida, digite [s] para sim ou [n] para não ..");
			}
				
	    }while(!(op1.toLowerCase().equals("s") || op1.toLowerCase().equals("n")));
			
		
		if(op1.toLowerCase().equals("s")) {
			System.out.println("Usuários deletados com sucesso!!");
		}else {
			System.out.println("Operação cancelada!!");
		}
		
		s.nextLine();
		
	}
}
