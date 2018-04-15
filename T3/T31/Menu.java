package T31;

import java.util.Scanner;

public class Menu {
	Scanner s;
	
	public Tela() {
		s = new Scanner(System.in);
	}
	
	public void menu() {
		int op = 0;
		
		while(op !=2) {
			System.out.println("-------------------------------");
			System.out.println("------ Opção 0: Inserir estante -------");			
			System.out.println("------ Opção 1: Inserir Livro -------");
			System.out.println("------ Opção 2: Remover Livro -------");
			System.out.println("------ Opção 3: Listar todos os livros -------");
			System.out.println("------ Opção 4: Listar livros de filosofia -------");
			System.out.println("------ Opção 5: Contar livros de ciência -------");
			System.out.println("------ Opção 6: Listar autores -------");
			System.out.println("------ Opção 7: Sair  -------");
			System.out.println("-------  Digite opção:  -------");
			op = s.nextInt();
			
			switch(op){
				case 0:
					
				break;
				
				case 1:
					
				break;
				
				case 2:
					
				break;
				case 3:
				
				break;
				case 4:
					
				break;
				case 5:
				
				break;
				case 6:
					
				break;
				case 7:
					
				break;
			}
		}
	}
	
}
