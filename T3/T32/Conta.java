package T32;

public class Conta {
	String nome;
	double saldo;
	
	protected Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double s) {
		this.saldo += s;
	}
	
	public void saca(double s) {
		if(s <= this.getSaldo()) {
			this.saldo -= s;
			System.out.println("Saldo atualizado com sucesso!");		
		}else {
			System.out.println("Saldo insuficiente para realizar opera��o!");
		}
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
