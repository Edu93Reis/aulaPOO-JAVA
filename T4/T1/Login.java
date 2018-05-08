package T1;

import java.util.ArraList;
import java.util.Scanner;

public class Login extends menu implements Autentica{
	Estante e = new Estante();
	Scanner s = new Scanner(System.in);

	public boolean autentica(Usuario u, String senha) {
		if(senha == "1234@Admin") {
			//todo o resto
			
			
		}else if(senha == "1234@Guest"){
			//consultar livros
			
			System.out.println("Digite o nome do livro: ");
			String livro = s.nextLine();
			
			consulta(livro);
			
			s.nextLine();
		}else if(senha == "1234@Bibli"){
			//inserir livros
			Bibliotecario b = new Bibliotecario;
			
			b.boasVindas();			
			System.out.println("Deseja inserir livro");
			
			e.insereLivro(l);
		}else {
			System.out.println("Usuário inexistente!");
		}
		
	}
	
	private void insereLivro(Livro l){
		String nome, autor;
		int ano;
		
		System.out.println("Deseja inserir livro? [s/n]");
		String op = s.nextLine();
		
		if(op.equals(s)) {
			
			do {
				System.out.println("Digite nome do livro: ");
				nome = s.nextLine();
				
				if(nome.equals(null)) {
					System.out.println("Nome deve ser preenchido!");
				}
				
				System.out.println("Digite autor do livro: ");
				autor = s.nextLine();
				
				if(autor.equals(null)) {
					System.out.println("Autor deve ser preenchido!");
				}
				
				System.out.println("Digite ano de publicação: ");
				ano = s.nextInt();
				
				if(ano <= 0) {
					System.out.println("Ano inexistente");
				}
			}while(nome.equals(null) || autor.equals(null) || ano <= 0);			
			
			Livro livro = new Livro(nome, autor, ano);
			e.insereLivro(livro);
			
			System.out.println("Livro inserido com sucesso!");
			
			s.nextLine();
		}else {
			u.despedida();
		}
	}
	
	private Livro consulta(String nome) {		
		if(nome == "" || nome == null) {
			System.out.println("Nome inválido! Tente novamente");
		}else {
			e.getLivro(nome);
		}		
	}
}
