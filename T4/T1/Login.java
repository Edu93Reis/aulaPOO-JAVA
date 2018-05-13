package T1;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	private String usuario, login;
	private Scanner s;
	
	public Login(Usuario u) {
		this.usuario = u.getClass().getCanonicalName();
		this.login = "";
		this.s = new Scanner(System.in);
	}
	
	public String getUsu() {
		return this.usuario;
	}
	
	public void login() {		
		
		switch(this.usuario){
			case "T1.Guest":
				System.out.println("Digite login: ");
				login = s.nextLine();
				Guest g = new Guest(login);
				
				if(true) {
					g.boasVindas();
					System.out.println("Entre opção: ");
					System.out.println("1 - para consultar livro");
					System.out.println("2 - para sair");
					int opt = s.nextInt();
					
					switch(opt) {
						case 1:
							System.out.println("Digite nome do livro: ");
							String nm = s.nextLine();
							g.consulta(nm);
						break;
						case 2:
							g.despedida();
						break;
						default:
							System.out.println("Opção inexistente!");
						break;
					}
				}else {
					this.erro();
				}
			break;
			case "T1.Bibliotecário":
				System.out.println("Digite login: ");
				login = s.nextLine();
				Bibliotecario b = new Bibliotecario(login);
				
				if(true) {
					b.boasVindas();
					System.out.println("Entre opção: ");
					System.out.println("1 - para inserir livro: ");
					System.out.println("2 - para sair: ");
					int opt1 = s.nextInt();
					
					switch(opt1) {
						case 1:
							System.out.println("Digite nome do livro: ");
							String nm = s.nextLine();
							b.insereLivro();
						break;
						case 2:
							b.despedida();
						break;
						default:
							System.out.println("Opção inexistente!");
						break;
					}
				}else {
					this.erro();
				}
			break;
			case "T1.Admin":
				System.out.println("Digite login: ");
				login = s.nextLine();
				Admin a = new Admin(login);
				
				if(true) {
					a.boasVindas();
					a.acao();
				}else {
					this.erro();
				}
			break;
			default:
				this.erro();
			break;
		}		
	}
	
	public void erro() {
		System.out.println("Erro!");
	}
}