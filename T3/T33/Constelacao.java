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
	 Uma Estrela é composta por nome, temperatura e cor.
 	 Uma Constelação possui um nome e tem várias Estrelas. Toda Estrela
	 possui um método mostrar() que mostra na tela todas as informações
	 sobre ela. Neste sistema, é possível incluir estrelas em uma constelação
	 usando o método void adicionar(Estrela e), mostrar as informa-
	 ções de todas as estrelas com o método void infoEstrelas() e exibir
	 a temperatura total somando-se todas as estrelas da constelação usando
	 o método double tempConstelacao(). Implemente as classes descritas 
	*/
}
