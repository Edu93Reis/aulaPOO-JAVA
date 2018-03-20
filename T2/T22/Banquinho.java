package T22;

public class Banquinho {
	public static void main(String args[]) {
		Cliente c1 = new Cliente("Eduardo",1200.00,5000.00);
		Cliente c2 = new Cliente("Carlos",2000.00,900.00);
		
		System.out.println("Telas saques: ");
		c1.sacar(6200.0);
		System.out.println("Saldo do cliente, " + c1.getNome() + ", é: "+ c1.checarSaldo());
		c2.sacar(100.0);
		System.out.println("Saldo do cliente, " + c2.getNome() + ", é: "+ c2.checarSaldo());
		c2.sacar(3000.0);
		
		Doc d1 = new Doc();		
		
		System.out.println("------------------------ Tela Docs: -------------------------------");
		System.out.println("Saldo inicial do cliente, "+ c1.getNome() +", é: "+ c1.checarSaldo());
		System.out.println("Saldo inicial do cliente, " + c2.getNome() + ", é: "+ c2.checarSaldo());
		System.out.println("------------------------ Transferência 1: --------------------------");
		d1.transferir(c1, c2, 300.00);
		System.out.println("Saldo atualizado do cliente, "+ c1.getNome() +", é: "+ c1.checarSaldo());
		System.out.println("Saldo atualizado do cliente, " + c2.getNome() + ", é: "+ c2.checarSaldo());
		System.out.println("------------------------ Transferência 2: --------------------------");
		d1.transferir(c1, c2, 30000.00);
		System.out.println("Saldo atualizado do cliente, "+ c1.getNome() +", é: "+ c1.checarSaldo());
		System.out.println("Saldo atualizado do cliente, " + c2.getNome() + ", é: "+ c2.checarSaldo());
		System.out.println("------------------------ Transferência 3: --------------------------");
		d1.transferir(c1, c2, 5900.00);
		System.out.println("Saldo atualizado do cliente, "+ c1.getNome() +", é: "+ c1.checarSaldo());
		System.out.println("Saldo atualizado do cliente, " + c2.getNome() + ", é: "+ c2.checarSaldo());
	}
}
