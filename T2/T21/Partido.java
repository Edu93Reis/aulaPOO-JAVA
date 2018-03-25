package T21;

public class Partido {
	private String nome, ideologia, sigla;
	private int num; 
	
	public Partido(String nome, String ideologia, String sigla, int num) {
		this.nome = nome;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.num = num;
	}	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getIdeologia() {
		return this.ideologia;
	}

	public String getSigla() {
		return this.sigla;
	}

	public int getNum() {
		return num;
	}
}