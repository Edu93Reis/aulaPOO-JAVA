package T1;

import java.util.Scanner;

public class Menu {
	Biblioteca b = new Biblioteca("Principal");	
	
	private Scanner s;
	
	public Menu() {
		this.s = new Scanner(System.in);
	}
	
	public void menu() {
		int opt = 0 ;
		
		while(opt != 9) {
			System.out.println("Controle de Biblioteca");
			System.out.println("1- Inserir Estante.");
			System.out.println("2- Inserir Livro.");
			System.out.println("3- Exibir tudo.");
			System.out.println("4- Remover Livro.");
			System.out.println("5- Contar livros de Ci�ncia.");
			System.out.println("6- Exibir livros de Filosofia");
			System.out.println("7- Listar autores");
			System.out.println("9- Sair.");
			System.out.println("Digite a op��o:");
			opt = s.nextInt();
			
			switch(opt) {
				case 1:
					b.criarEstante();
					break;
				case 2:
					int option = this.escolheEstante();
					b.getEstante(option).insereLivro(b.getEstante(option).criaLivro());
					break;
				case 3:
					b.listarTudo();
					break;
				case 4:
					int i = this.escolheEstante();
					if (i==-1) {
						break;
					}
					int livro;
					if(b.getEstante(i).getLivro().size()==0)
						System.out.println("N�o h� livros para excluir");
					else {
						do {
							System.out.println("Escolha o livro para excluir:");
							b.getEstante(i).getLivros();
							livro = Math.max(0,s.nextInt());
								if (livro >= b.getEstante(i).getLivro().size()) {
									System.out.println("Livro inv�lido");
								}
								else {
									b.getEstante(i).removeLivro(b.getEstante(i).getLivro(livro));
									break;
								}
						}
						while (livro >= b.getEstante(i).getLivro().size());
					}
				case 5:
					
					System.out.println(b.contarCiencia());
					break;
				case 6:
					if (b.listarFilosofia().size() == 0) {
						System.out.println("N�o h� livros de Filosofia");
					}
					else {
						for(int a = 0; a < b.listarFilosofia().size(); a ++) {
							System.out.println(b.listarFilosofia().get(a).getNome());
						}
					}
					break;
				case 7:
					
					Categoria cat = b.escolheCategoria();
					for(int w = 0; w < b.listarAutores(cat).size(); w++) {
						System.out.println(b.listarAutores(cat).get(w));
					};
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
		System.out.println("Erro: Op��o inv�lida");
	}
	
	public int escolheEstante() {
		int opt;
		if (b.getEstante().size() == 0) {
			System.out.println("N�o h� estantes dispon�veis na biblioteca.");
			return -1;
		}
		else {
			do {
				int y = 0 ;
				System.out.println("Escolha a estante:");
				for (int x=0; x < b.getEstante().size() ; x++) {
					System.out.println("Estante " + y + ":" + b.getEstante(x).getNome());
					y++;
				}
	
				opt = Math.max(0, s.nextInt());
				if (opt >= b.getEstante().size()) {
					System.out.println("Estante inv�lida.");
				}
			}
			while (opt >= b.getEstante().size());
			return opt;
		}
	}
	
}
