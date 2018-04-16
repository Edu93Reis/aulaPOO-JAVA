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
	
	
	/* Sabe-se que VIP, Premium e Regular são tipos de Cliente. Em cada cliente, há a necessidade de controle de conta corrente.
	Em uma conta, há dados como nome, e saldo. Para cada tipo de conta
	uma tarifa deve ser calculada: 1% do saldo para Regular, 2% para Premium e 4% para VIP. Use Herança. Aqui, fica proíbido usar conceitos
	que não foram vistos em aula. */
}
