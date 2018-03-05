package T12;

public class Lampada {
	boolean estado;
	int limite, count;
	
//método liga lâmpada e controla limite de cliques, não retorna valor (void)
	
	void turnOn() {
	    //caso contador seja >= que o limite de cliques, estado da lâmpada fica para sempre falseo
		if(count >= getLimite()) {
			System.out.println("Impossível prosseguir, lâmpada está queimada");
			estado = false;
		} else {
			//liga a lâmpada
			estado = true;
		}
		count++;	
	}
	
	void turnOff() {
		if(count >= getLimite()) {
			System.out.println("Impossível prosseguir, lâmpada está queimada");
			//desliga a lâmpada	
			estado = false;
		}else {
			//liga a lâmpada
			estado = true;
		}
		count++;
	}
	
	//método setter, define limite de cliques
	void setLimite(int l) {
		limite = l;		
	}

	//metodo getter, retorna limite para acesso em métodos e classes
	int getLimite() {
		return limite;
	}
	
	//Metodo que retorna se a lâmpada está ou não ligada
	void status() {
		//verifica se a lâmpada está ligada ou não pelo status da variável local estado
		if(estado==true) {
			System.out.println("Lâmpada está ligada");
		}else{
			System.out.println("Lâmpada está desligada");
		}
	}
}
