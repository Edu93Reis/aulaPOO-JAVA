package T33;

public class Estrela {
	String nome, cor;
	Double temperatura;
	
	public Estrela(String nome, String cor, Double temperatura) {
		this.nome = nome;
		this.cor = cor;
		this.temperatura = temperatura;
	}

	public void mostrar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cor: " + this.cor);
		System.out.println("Temperatura: " + this.temperatura);
	}	
}
