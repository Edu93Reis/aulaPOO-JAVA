package T31;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Estante> estantes;
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.estantes = new ArrayList<Estante>();
	}
	
	public void inserirEstante(Estante estante) {
		if(estante != null) {
			this.estantes.add(estante);
		}
	}
	
	public String getNome() {
		return this.nome;
	}
}
