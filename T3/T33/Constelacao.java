package T33;

import java.util.ArrayList;

public class Constelacao {
	private String nome;
	private ArrayList<Estrela> estrelas;
	
	public Constelacao(String nome) {
		this.nome = nome;
		this.estrelas = new ArrayList<Estrela>();
	}
	
	public void adicionarEstrela(Estrela e) {
		if(e!=null) {
			this.estrelas.add(e);
		}
	}
	
	public void infoEstrelas() {
		for(Estrela e: estrelas) {
			e.mostrar();
		}
	}
	
	public double tempConstelacao() {
		double soma = 0;
		
		for(Estrela e: estrelas) {
			soma += e.getTemperatura();
		}
		
		return soma;
	}
	
	/*
	 Uma Estrela � composta por nome, temperatura e cor.
 	 Uma Constela��o possui um nome e tem v�rias Estrelas. Toda Estrela
	 possui um m�todo mostrar() que mostra na tela todas as informa��es
	 sobre ela. Neste sistema, � poss�vel incluir estrelas em uma constela��o
	 usando o m�todo void adicionar(Estrela e), mostrar as informa-
	 ��es de todas as estrelas com o m�todo void infoEstrelas() e exibir
	 a temperatura total somando-se todas as estrelas da constela��o usando
	 o m�todo double tempConstelacao(). Implemente as classes descritas 
	*/
}
