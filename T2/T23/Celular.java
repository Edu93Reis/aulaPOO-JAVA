package T23;

public class Celular {
	private static int identificador = 0;
	private String nomeUser;
	private Bateria bateria;
	private boolean ligado;
	
	public Celular(String nomeUser, Bateria b) {
		Celular.identificador = identificador+1;
		this.nomeUser = nomeUser;
		this.bateria = b;
		this.ligado = false;
	}
	
	public int getId() {
		return Celular.identificador;
	}
	
	public String getUser() {
		return this.nomeUser;
	}
	
	//permitido pois trabalha com elemento composto(objeto)
	public void setBateria(Bateria bateria) {
		if(this.ligado == true) {
			this.ligado = false;
		}
		
		this.bateria = bateria;
	}
	
	public void ligaCelular() {
		if(this.ligado == false) {
			if(this.bateria.getCarga()>20) {
				this.ligado = true;
				System.out.println("Usuário: " + getUser() + ", Id celular: " + getId()); 
				
				bateria.setCarga(bateria.getCarga()-20);
				
			}else if(this.bateria.getCarga() == 0) {
				System.out.println("");
			}else {
				this.ligado = true;
				this.bateria.getCarga();
			}
		} else {
			System.out.println("Celular já está ligado!");
		}
	}
	
	public void desligaCelular() {
		if(this.ligado == true) {
			if(bateria.getCarga()<=20) {
				this.ligado = false;
			}else {
				System.out.println("Bye!");
				if(bateria.getCarga()>20)
					bateria.setCarga(bateria.getCarga()-10);
					this.ligado = false;
			}
		} else {
			this.ligado = false;
		}
	}
	
	public void tocaSom() {
		if(this.ligado == true) {
			if(bateria.getCarga()>10) {
				System.out.println("Baaat-Maaan!!!");
			}
		}
	}

}
