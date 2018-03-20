package T22;

public class Doc {	
	public double transferir(Cliente c1, Cliente c2, double quantia) {
		if(c1.checarSaldo()>=quantia) {
			c2.setSaldo(c2.getSaldo()+quantia);
			c1.setSaldo(c1.getSaldo()-quantia);
			return c2.getSaldo();
		}else {
			System.out.println("Saldo insuficiente para trasnfer�ncia!!");
			return 0;
		}
	}
}

/*
 
 Implemente, tamb�m, uma classe Doc que possui o m�todo
 transferir(Cliente c1, Cliente c2, double quantia) que saca
 uma quantia de c1, se este tiver saldo, e deposita na conta de c2.
 Implemente tamb�m alguns testes. � pro�bido usar conceitos que ainda
 n�o foram abordados.
 
 */
