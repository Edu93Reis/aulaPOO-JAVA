package T31;

import java.util.ArrayList;

public class Estante {
	private String nome;
	private Categoria categoria;
	private ArrayList<Livro> livros;
	
	public Estante(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.livros = new ArrayList<Livro>();
	}
	
	
	//caso entrada de instância de objeto livro não esteja vazia
	//add dados ao ArrayList Livro
	public void inserirLivro(Livro livro) {
		if(livro != null) {
			this.livros.add(livro);
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCategoria() {
		return this.categoria.getTipo();
	}
	
	/* alterar para retornar como lista [] */
	public Livro[] listarLivrofilosofia() {
		//cria contador para inicializar vetor estático
		int qt = 0;
		//cria vetor estático e, logo abaixo, cria instância deste vetor
		Livro[] result;
		result = new Livro[qt];
		
		if(this.getCategoria() == "Filosofia") {
			// para cada objeto de categoria Filosofia add objeto l
			// acumula o contador qt++
			for(Livro l : livros) {
				result[qt++] = l;
			}
		}
		return result;		
	}
	
	public int contarCiencia() {
		int countBooks = 0;
		
		if(this.getCategoria() == "Ciência") {
			for(int i = 0; i<this.livros.size(); i++) {
				countBooks ++;
			}
		}
	
		return countBooks;
	}
	
	public void listarTudo() {
		for(Livro l : livros) {
			System.out.println("Nome: " + l.getNome() + " Autor: " + l.getAutor() + " Ano de Publicação: " + l.getAnoPublicacao());
		}
	}
	
	public void removerLivro(Livro livro) {
		this.livros.remove(livro);
		System.out.println("Livro removido com sucesso!");
	}
	
	public ArrayList<String> listarAutores(Categoria cat){
		ArrayList<String> autores;
		autores = new ArrayList<String>();
				
		if(this.categoria == cat) {
			for(Livro l : livros)
				autores.add(l.getNome());
		}	
		
		return autores;
	}
}
