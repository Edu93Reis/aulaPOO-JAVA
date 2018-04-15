package T31;

public enum Categoria {
	Tipo1("Ciência"),
	Tipo2("Filosofia"),
	Tipo3("Litertura");
	
	private String tipo;
	
	Categoria(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo.toString();
	}
}
