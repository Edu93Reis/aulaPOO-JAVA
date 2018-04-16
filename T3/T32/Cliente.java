package T32;

import java.util.HashMap;

public class Cliente{
	private Tipo tipo;
	private HashMap<String, Conta> clientes;
	
	public Cliente() {
		this.clientes = new HashMap<String, Conta>();
	}
	
	public void addCliente(String tipo, Conta c) {
		if(!c.equals(null)) {
			this.clientes.put(tipo, c);
		}else {
			System.out.println("Cliente inexistente!");
		}
	}
	
	
	/* Sabe-se que VIP, Premium e Regular s�o tipos de Cliente. Em cada cliente, h� a necessidade de controle de conta corrente.
	Em uma conta, h� dados como nome, e saldo. Para cada tipo de conta
	uma tarifa deve ser calculada: 1% do saldo para Regular, 2% para Premium e 4% para VIP. Use Heran�a. Aqui, fica pro�bido usar conceitos
	que n�o foram vistos em aula. */
}
