package T23;

public class cadeMeuCelular {

	public static void main(String[] args) {
		Bateria b1 = new Bateria(70);
		System.out.println(b1.carrega());
		System.out.println(b1.carrega());
		System.out.println(b1.carrega());
		System.out.println(b1.descarrega());
		System.out.println(b1.descarrega());
		Celular c1 = new Celular("Eduardo", b1);
		c1.ligaCelular();
		c1.tocaSom();
		c1.desligaCelular();
		c1.ligaCelular();
		c1.ligaCelular();
		c1.desligaCelular();
		System.out.println("Carga final: "+b1.getCarga());
		c1.tocaSom();
		c1.ligaCelular();
		c1.tocaSom();
		
		Bateria b2 = new Bateria(23);
		c1.setBateria(b2);
		c1.ligaCelular();
		
		System.out.println(b2.getCarga());
		
		Celular c2 = new Celular("Caio", b2);
		c2.ligaCelular();
		System.out.println(b2.carrega());
		System.out.println(b2.carrega());
		System.out.println(b2.carrega());
		System.out.println(b2.carrega());
		System.out.println(b2.carrega());
		System.out.println(b2.carrega());
		System.out.println("Carga atual: "+b2.getCarga());
		
		c2.ligaCelular();
		
		Celular c3 = new Celular("Caio", b2);
		c3.ligaCelular();
	}

}
