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
			System.out.println("Produto sem descri��o!! Deseja cadastrar descri��o [y/n]");	
			String op = a.nextLine();					
				
				if(op.equals("y")) {
					System.out.println("Digite descri��o: ");
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
	
	//liberado pois � um set usado para enum
	public void setTipo(Livros tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		if(this.tipo == Livros.Epub) {
			return "Epub";
		} else if(this.tipo == Livros.PDF) {
			return "PDF";
		}else {
			return "Livro F�sico";
		}
	}
	
	public void precoLivro(Livros tipo) {
		if(this.tipo == Livros.Epub) {
			this.preco = 20.00;
		}else if(this.tipo == Livros.PDF) {
			this.preco = 40.00;
		}else{
			this.preco = 80.00;
		}
	}
	
	public double getPreco() {
		if(this.tipo == Livros.Epub) {
			return this.preco;
		}else if(this.tipo == Livros.PDF) {
			return this.preco;
		}else if (this.tipo == Livros.Livro_Fisico){
			return this.preco;
		}else {
			System.out.println("Tipo inexixtente!!");
			return 0;
		}
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
