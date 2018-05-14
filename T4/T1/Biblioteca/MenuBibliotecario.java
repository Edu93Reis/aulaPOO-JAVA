package Biblioteca;

import java.util.Scanner;

public class MenuBibliotecario {
	Biblioteca b = new Biblioteca("Principal");	
	
	private Scanner s;
	
	public MenuBibliotecario() {
		this.s = new Scanner(System.in);
	}
	
	public void menu() {
		int opt = 0 ;
		
		while(opt != 9) {
			System.out.println("Controle de Biblioteca");
			System.out.println("1- Inserir Livro.");
			System.out.println("2- Remover Livro.");
			System.out.println("9- Sair.");
			System.out.println("Digite a opção:");
			opt = s.nextInt();
			
			switch(opt) {
				case 1:
					int option = this.escolheEstante();
					b.getEstante(option).insereLivro(b.getEstante(option).criaLivro());
					break;
				case 2:
					try {
						this.MetodoException();
						break;
					}
					catch(BookNotFound e) {
						System.out.println(e.getMessage());
						break;
					}
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
	
	public int escolheEstante() {
		int opt;
		if (b.getEstante().size() == 0) {
			System.out.println("Não há estantes disponíveis na biblioteca.");
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
					System.out.println("Estante inválida.");
				}
			}
			while (opt >= b.getEstante().size());
			return opt;
		}
	}
	
	public void MetodoException() throws BookNotFound {
		int i = this.escolheEstante();
		int livro;
		if(b.getEstante(i).getLivro().size()==0)
			System.out.println("Não há livros para excluir");
		else {
				System.out.println("Escolha o livro para excluir:");
				b.getEstante(i).getLivros();
				livro = s.nextInt();
					if(livro<0 || livro > i) {
						throw new BookNotFound("Livro não encontrado");
					}
					else {
						b.getEstante(i).removeLivro(b.getEstante(i).getLivro(livro));
					}
					
			}

	}
}