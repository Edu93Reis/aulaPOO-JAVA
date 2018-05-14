package Biblioteca;

import java.util.Scanner;

public class MenuGuest {
	Biblioteca b = new Biblioteca("Principal");	
	
	private Scanner s;
	
	public MenuGuest() {
		this.s = new Scanner(System.in);
	}
	
	public void menu() {
		int opt = 0 ;
		
		while(opt != 9) {
			System.out.println("Biblioteca");
			System.out.println("1- Exibir tudo.");
			System.out.println("9- Sair.");
			System.out.println("Digite a opção:");
			opt = s.nextInt();
			
			switch(opt) {
				case 1:
					b.listarTudo();
					break;
				case 9:
					System.out.println("Fim...");
					break;
				default:
					this.erro();
					break;
			}
		}
		
		
	}
	
	public void erro() {
		System.out.println("Erro: Opção inválida");
	}	

}
