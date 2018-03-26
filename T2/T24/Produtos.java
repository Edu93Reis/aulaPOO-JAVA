package T24;
import java.util.Scanner;


public class Produtos {
	private String description;
	private double preco;
	private Livros tipo;
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		Scanner a = new Scanner(System.in);
		
		if(this.description == null) {
			System.out.println("Produto sem descrição!! Deseja cadastrar descrição [y/n]");	
			String op = a.nextLine();					
				
				if(op.equals("y")) {
					System.out.println("Digite descrição: ");
					this.description = a.nextLine();
					setDescription(this.description);
					a.close();
					return this.description;
				} else {					
					return null;
				}	
				
		} else {			
			return this.description;
		}
		
	}
	
	//liberado pois é um set usado para enum
	public void setTipo(Livros tipo) {
		this.tipo = tipo;
	}
	
	public void getTipo() {
		if(this.tipo == Livros.EPUB) {
			System.out.print(Livros.EPUB.getLivro());
		} else if(this.tipo == Livros.PDF) {
			System.out.print(Livros.PDF.getLivro());
		}else {
			System.out.print(Livros.LIVRO.getLivro());
		}
	}
	
	public void precoLivro(Livros tipo) {
		if(this.tipo == Livros.EPUB) {
			this.preco = 20.00;
		}else if(this.tipo == Livros.PDF) {
			this.preco = 40.00;
		}else{
			this.preco = 80.00;
		}
	}
	
	public double getPreco() {
		if(this.tipo == Livros.EPUB) {
			return this.preco;
		}else if(this.tipo == Livros.PDF) {
			return this.preco;
		}else if (this.tipo == Livros.LIVRO){
			return this.preco;
		}else {
			System.out.println("Tipo inexixtente!!");
			return 0;
		}
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
