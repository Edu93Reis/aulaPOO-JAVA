package T24;

public class Loja {
	public static void main(String arg[]) {
		Produtos p1 = new Produtos();
		
		p1.setTipo(Livros.EPUB);
		p1.precoLivro(Livros.EPUB);
		p1.getTipo();
		System.out.println (" custa: "+ p1.getPreco() + " reais");
		p1.setDescription("Epub � divertido");
		System.out.println("Descri��o Epub: " + p1.getDescription());
		
		Produtos p2 = new Produtos();
		
		p2.setTipo(Livros.LIVRO);
		p2.precoLivro(Livros.LIVRO);
		p2.getTipo();
		System.out.println(" custa: " + p2.getPreco() + " reais \n");
		System.out.println("Descri��o Livro Fis�co: " + p2.getDescription());
	
		Produtos p3 = new Produtos();
		
		p3.setTipo(Livros.PDF);
		p3.precoLivro(Livros.PDF);
		p3.getTipo();
		System.out.println(" �: "+ p3.getPreco() + " reais");
		p3.setDescription("PDF");
		System.out.println("Descri��o PDF: " + p3.getDescription());
		
	}
}

/*
Uma loja vende livros de v�rios formatos a pre�o fixo.
Um EPUB custa 20 reais, um pdf 40 reais e um f�sico 80 reais. 

A informa��o de preco e de tipo devem ser retornados por m�todos. Uma loja
pode vender qualquer um deles. 

A loja dever� poder exibir as informa-
��es de seus produtos, caso os tenha dispon�vel. 

Implemente todas as classes envolvidas nessa situa��o, 
lembre-se de usar construtores e metodos get, se necess�rio. 
Implemente tamb�m alguns testes. � pro�bido usar conceitos que ainda n�o foram abordados.
 */