package T32;

import java.util.ArrayList;

public class Vip extends Conta{
	private final double tarifa = 0.04;
	
	public Vip(String nome, double saldo) {
		super(nome, saldo);
	}
	
	public double getTarifa() {
		return this.tarifa;
	}
	
	public double atualizaSaldo() {
		super.saldo *= tarifa;
		return saldo;
	}
}

/*
Sabe-se que VIP, Premium e Regular s�o tipos de Cliente. 
Em cada cliente, h� a necessidade de controle de conta corrente.
Em uma conta, h� dados como nome, e saldo. Para cada tipo de conta
uma tarifa deve ser calculada: 1% do saldo para Regular, 2% para Premium e 4% para VIP. 
Use Heran�a. Aqui, fica pro�bido usar conceitos que n�o foram vistos em aula.

Esboce um diagrama de classes.
� Implemente as classes e seus m�todos.
� Crie um pequeno menu para cadastrar clientes e vericar o valor das tarifas.
*/
