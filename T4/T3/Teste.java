package T3;

public class Teste {
	public static void main(String args[]) {
		IPI a = new IPI();
		ICMS b = new ICMS();
		Produto p1 = new Produto("Carro", 90640, a);
		Produto p2 = new Produto("Lego", 120.00, b);
		
		p1.getProduto();
		p1.setImposto(b);
		p1.getProduto();
		p2.getProduto();
	}
}
