package T12;

public class Lampada {
	boolean estado;
	int limite, count;
	
//m�todo liga l�mpada e controla limite de cliques, n�o retorna valor (void)
	
	void turnOn() {
	    //caso contador seja >= que o limite de cliques, estado da l�mpada fica para sempre falseo
		if(count >= getLimite()) {
			System.out.println("Imposs�vel prosseguir, l�mpada est� queimada");
			estado = false;
		} else {
			//liga a l�mpada
			estado = true;
		}
		count++;	
	}
	
	void turnOff() {
		if(count >= getLimite()) {
			System.out.println("Imposs�vel prosseguir, l�mpada est� queimada");
			//desliga a l�mpada	
			estado = false;
		}else {
			//liga a l�mpada
			estado = true;
		}
		count++;
	}
	
	//m�todo setter, define limite de cliques
	void setLimite(int l) {
		limite = l;		
	}

	//metodo getter, retorna limite para acesso em m�todos e classes
	int getLimite() {
		return limite;
	}
	
	//Metodo que retorna se a l�mpada est� ou n�o ligada
	void status() {
		//verifica se a l�mpada est� ligada ou n�o pelo status da vari�vel local estado
		if(estado==true) {
			System.out.println("L�mpada est� ligada");
		}else{
			System.out.println("L�mpada est� desligada");
		}
	}
}
