package T32;

import java.util.ArrayList;

public class Regular extends Conta {
	private final double tarifa = 0.01;
	
	public Regular(String nome, double saldo) {
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
