package T3;

public class Imposto {
	protected double aliquota;
	
	protected Imposto(double aliquota) {
		this.aliquota = aliquota;
	}
}

/*Exerc�cio 1.3. Um produto � composto por nome e pre�o. Sabe-se
que todo produto tem um imposto apenas. IPI e ICMS s�o impostos
poss�veis (um produto pode ter apenas um deles para facilitar). IPI
e ICMS possuem aliquotas de 5% e 10% (valores fict�cios) respectivamente. Todo produto deve ter a funcionalidade de mostrar o nome e o
pre�o j� descontado o imposto. Use o m�ximo de orienta��o a objetos
poss�vel para codificar as classes. */
