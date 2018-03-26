package T24;

public enum Livros {
	Epub("Epub"), PDF("PDF"), Livro_Fisico("Livro Físico");
	
	private String livro;
	
	Livros(String livro){
		this.livro = livro;
	}
	
	public String getLivro() {
		return this.livro.toString();
	}
}
