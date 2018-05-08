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
