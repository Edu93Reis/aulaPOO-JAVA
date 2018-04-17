package T31;

import java.util.ArrayList;
import java.util.Scanner;

public class Estante {
	Scanner s;
	private String nome;
	private Categoria categoria;
	private ArrayList<Livro> livros;
	
	public Estante(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.livros = new ArrayList<Livro>();
		this.s = new Scanner(System.in);
	}

	public String getNome() {
		return nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void getLivros() {
		int y = 0;
		for (int i=0; i < this.livros.size() ; i ++) {
			System.out.println("Livro " + y);
			System.out.println("Título:" + livros.get(i).getNome());
			System.out.println("Autor:" + livros.get(i).getAutor());
			System.out.println("Ano:" 	+ livros.get(i).getAno());
			y++;
		}

	}
	
	public ArrayList getLivro() {
		return this.livros;
	}
	
	public Livro getLivro(int i) {
		return this.livros.get(i);
	}
	
	public void removeLivro(Livro livro) {
		this.livros.remove(livro);
		
	}
	
	public void insereLivro(Livro livro) {

		this.livros.add(livro);		
		
	}
	
	public Livro criaLivro() {
		System.out.println("Insira o titulo do livro:");
		String nome = s.next();
		System.out.println("Insira o autor do livro:");
		String autor = s.next();
		int ano;
		do {
			System.out.println("Insira o ano de publicação do livro:");
			ano = Math.max(0,s.nextInt());
				if (ano > 2018) {
					System.out.println("Ano inválido");
				}
		}
		while (ano > 2018);
		Livro l = new Livro(nome,autor,ano);
		return l;
	}
	
}
