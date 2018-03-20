package T23;

public class Bateria {
	private int carga = 0;
	
	public Bateria(int carga){
		if(carga<=100) {
			this.carga = carga;
		}else {
			this.carga = 100;
		}
	}
	
	//necessário para fazer as alterações de alimentação de carga durante os processos de ligar/desligar
	public void setCarga(int carga){
		if(carga<=100) {
			this.carga = carga;
		}else {
			this.carga = 100;
		}
	}
	
	public int getCarga(){
		if(this.carga>20) {
			return this.carga;
		}else {
			System.out.println("Bateria fraca");
			return this.carga;
		}
	}
	
	public int Carrega(){
		if(this.carga<95) {
			this.carga += 5;
		}else {
			System.out.println("Bateria no limite, ímpossível aumentar carga!!!");
			this.carga = 100;
		}
		return this.carga;
	}
	
	public int Descarrega(){		
		if(getCarga()>=10) {
			this.carga -= 10;
		} else {
			this.carga = 0;
		}
		
		return this.carga;
	}
}
