package T32;

import java.util.ArrayList;

public class Premium extends Conta {
	private final double tarifa = 0.02;
	
	public Premium(String nome, double saldo) {
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
