package T3;

public class Imposto {
	protected double aliquota;
	
	protected Imposto(double aliquota) {
		this.aliquota = aliquota;
	}
}

/*Exercício 1.3. Um produto é composto por nome e preço. Sabe-se
que todo produto tem um imposto apenas. IPI e ICMS são impostos
possíveis (um produto pode ter apenas um deles para facilitar). IPI
e ICMS possuem aliquotas de 5% e 10% (valores fictícios) respectivamente. Todo produto deve ter a funcionalidade de mostrar o nome e o
preço já descontado o imposto. Use o máximo de orientação a objetos
possível para codificar as classes. */
