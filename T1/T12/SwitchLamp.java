package T12;

public class SwitchLamp {

	public static void main(String[] args) {
		// instancia da classe lampada, criando nova lampada
		Lampada l1 = new Lampada();
		
		l1.setLimite(3);
		l1.turnOn();
		l1.status();
		l1.turnOff();
		l1.status();
		l1.turnOn();
		l1.status();
		l1.turnOn();
	}

}
