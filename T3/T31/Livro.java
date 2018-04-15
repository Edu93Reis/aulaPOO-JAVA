package T31;

public class Livro {
	private String nome;
	private String autor;
	private String anoPublicacao;
	
	public Livro(String nome, String autor, String anoPublicacao) {
		this.nome = nome;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getAnoPublicacao() {
		return this.anoPublicacao;
	}
}
