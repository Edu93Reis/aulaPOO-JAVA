package T33;

public class Universo {

	public static void main(String[] args) {
		Estrela e1 = new Estrela("Feinha","Verda",50.3);
		Estrela e2 = new Estrela("Tortinhas","Chocolate Branco",25.99);
		Estrela e3 = new Estrela("Fatec","Branco",8.9);
		Constelacao c1 = new Constelacao("Rândomica");
		
		c1.adicionarEstrela(e1);
		c1.adicionarEstrela(e2);
		c1.adicionarEstrela(e3);
		c1.infoEstrelas();
		System.out.println("Temperatura da constelação: "+c1.tempConstelacao());
	}

}
