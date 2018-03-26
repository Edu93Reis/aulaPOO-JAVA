package T24;

public enum Livros {
	EPUB("Epub"), PDF("PDF"), LIVRO("Livro Físico");
	
	private String livro;
	
	Livros(String livro){
		this.livro = livro;
	}
	
	public String getLivro() {
		return this.livro.toString();
	}
}
