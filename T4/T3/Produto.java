package T3;

public class Produto {
	private String nome;
	private double preco;
	private Imposto imposto;
	
	public Produto(String nome, double preco, Imposto imposto) {
		this.nome = nome;
		this.preco = preco;
		this.imposto = imposto;
	}
	
	private double getPreco() {
		return this.preco * this.imposto.aliquota;
	}
	
	private String getNome() {
		return this.nome;
	}
	
	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	public void getProduto() {
		System.out.println("Nome: " + getNome() + " Pre�o: " + getPreco());
	}
}

/*Exerc�cio 1.3. Um produto � composto por nome e pre�o. Sabe-se
que todo produto tem um imposto apenas. IPI e ICMS s�o impostos
poss�veis (um produto pode ter apenas um deles para facilitar). IPI
e ICMS possuem aliquotas de 5% e 10% (valores fict�cios) respectivamente. 
Todo produto deve ter a funcionalidade de mostrar o nome e o
pre�o j� descontado o imposto. Use o m�ximo de orienta��o a objetos
poss�vel para codificar as classes. */
