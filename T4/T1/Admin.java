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
	
	public void excluirTodos() {
		String op1;	
	    Scanner s = new Scanner(System.in);
		
	    do {
			System.out.println("Deseja realmente apagar todos os usu�rios? [s/n]");
			op1 = s.nextLine();
			if(!(op1.toLowerCase().equals("s") || op1.toLowerCase().equals("n"))) {
				System.out.println("Entrada inv�lida, digite [s] para sim ou [n] para n�o ..");
			}
				
	    }while(!(op1.toLowerCase().equals("s") || op1.toLowerCase().equals("n")));
			
		
		if(op1.toLowerCase().equals("s")) {
			System.out.println("Usu�rios deletados com sucesso!!");
		}else {
			System.out.println("Opera��o cancelada!!");
		}
		
		s.nextLine();
		
	}
}
