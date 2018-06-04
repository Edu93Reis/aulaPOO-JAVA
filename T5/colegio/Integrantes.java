package colegio;

public enum Integrantes {
	Tipo1("SECRETARIO"), 
	Tipo2("PROFESSOR"), 
	Tipo3("ALUNO");
	
	private String tipo;
	
	Integrantes(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
