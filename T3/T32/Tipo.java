package T32;

public enum Tipo {
	Tipo1("VIP"),
	Tipo2("Premium"),
	Tipo3("Regular");
	
	private String tipo;
	
	Cliente(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo.toString();
	}
}
