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
			System.out.println("------ Op��o 0: Inserir estante -------");			
			System.out.println("------ Op��o 1: Inserir Livro -------");
			System.out.println("------ Op��o 2: Remover Livro -------");
			System.out.println("------ Op��o 3: Listar todos os livros -------");
			System.out.println("------ Op��o 4: Listar livros de filosofia -------");
			System.out.println("------ Op��o 5: Contar livros de ci�ncia -------");
			System.out.println("------ Op��o 6: Listar autores -------");
			System.out.println("------ Op��o 7: Sair  -------");
			System.out.println("-------  Digite op��o:  -------");
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
