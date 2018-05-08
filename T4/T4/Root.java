package T4;

import java.util.Scanner;

public class Root extends Usuario{	
	public Root(String login) {
		super(login);
	}
	
	public void despedida() {
		System.out.println("Voc� est� encerrando a sess�o "+ super.login+" , todos os usu�rios ativos ser�o encerrados automaticamente.");
	}
	
	public void descreve() {
		System.out.println("Superusu�rio, possui o controle total do sistema");
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
