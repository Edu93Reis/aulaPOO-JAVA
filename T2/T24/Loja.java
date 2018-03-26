package T24;

public class Loja {
	public static void main(String arg[]) {
		Produtos p1 = new Produtos();
		
		p1.setTipo(Livros.EPUB);
		p1.precoLivro(Livros.EPUB);
		p1.getTipo();
		System.out.println (" custa: "+ p1.getPreco() + " reais");
		p1.setDescription("Epub é divertido");
		System.out.println("Descrição Epub: " + p1.getDescription());
		
		Produtos p2 = new Produtos();
		
		p2.setTipo(Livros.LIVRO);
		p2.precoLivro(Livros.LIVRO);
		p2.getTipo();
		System.out.println(" custa: " + p2.getPreco() + " reais \n");
		System.out.println("Descrição Livro Fisíco: " + p2.getDescription());
	
		Produtos p3 = new Produtos();
		
		p3.setTipo(Livros.PDF);
		p3.precoLivro(Livros.PDF);
		p3.getTipo();
		System.out.println(" é: "+ p3.getPreco() + " reais");
		p3.setDescription("PDF");
		System.out.println("Descrição PDF: " + p3.getDescription());
		
	}
}

/*
Uma loja vende livros de vários formatos a preço fixo.
Um EPUB custa 20 reais, um pdf 40 reais e um físico 80 reais. 

A informação de preco e de tipo devem ser retornados por métodos. Uma loja
pode vender qualquer um deles. 

A loja deverá poder exibir as informa-
ções de seus produtos, caso os tenha disponível. 

Implemente todas as classes envolvidas nessa situação, 
lembre-se de usar construtores e metodos get, se necessário. 
Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados.
 */