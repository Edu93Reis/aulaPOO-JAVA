package T22;

public class Cliente {
	private String nome;
	private double saldo, limite;
	
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	//necessario para calculo de Doc
	public void setSaldo(double saldo) {
		this.saldo = Math.max(0, saldo);
	}

	public double getLimite() {
		return limite;
	}
	
	public double sacar(double val) {
		// o correto seria maior igual, permitindo zerar a conta, 
		// mas o enunciado diz para permitir apenas se maior
		if(checarSaldo() > val) {
			this.saldo -= val;
			return this.saldo;
		}else {
			System.out.println("Saldo de: "+ getRestricao() +" � insuficiente para um saque neste valor!");
			return 0;
		}
	}
	
	public double getRestricao() {
		double restricao = getSaldo()+getLimite();
		return restricao;
	}
	
	public double checarSaldo() {
		return getRestricao();
	}
	
	/*
		 Implemente a classe Cliente que possua os atributos
		nome, saldo e limite. Esta deve conter os m�todos sacar(double val),
		depositar(double val), e gets para nome, saldo e limite. Sabe-se
		que s� � poss�vel sacar se o saldo+limite forem superiores a quantia. O m�todo checar saldo deve retornar o valor saldo mais o limite
		limite. Implemente, tamb�m, uma classe Doc que possui o m�todo
		transferir(Cliente c1, Cliente c2, double quantia) que saca
		uma quantia de c1, se este tiver saldo, e deposita na conta de c2.
		Implemente tamb�m alguns testes. � pro�bido usar conceitos que ainda
		n�o foram abordados.
	 */
}
