package T21;

public enum Partidos {
	PT("PT", "Partido dos Trabalhadores", "Bla" ,13),
	PSDB("PSDB", "Partido da Social Democracia Brasileira", "Blabla" ,45),
	PTB("PTB", "Partido Trabalhista Brasileiro", "Vish" , 14),
	PSOL("PSOL", "Partido Socialismo e Liberdade", "Eita!" ,50);
	
	private String sigla, partido, ideologia ;
	private int numero;
	
	Partidos(String sigla, String partido, String ideologia ,int numero){
		this.sigla = sigla;
		this.partido = partido;
		this.ideologia = ideologia;
		this.numero = numero;		
	}
	
	public String getSigla() {
		return this.sigla.toString();
	}
	
	public String getPartido() {
		return this.partido.toString();
	}
	
	public String getIdeologia() {
		return this.ideologia.toString();
	}
	
	public int getNum() {
		return this.numero;
	}
}
