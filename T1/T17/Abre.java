package T17;

public class Abre {

	public static void main(String[] args) {
		// Instancia (cria) objeto abre do tipo Porta - tipo da Classe Porta, 
		// permitindo acesso aos atributos setados para porta
		Porta abre = new Porta();
		
		//objeto abre acessa metodos de Porta
		abre.abrir();
		abre.abrir();
		abre.fechar();
		abre.abrir();
		abre.fechar();
		abre.fechar();
		System.out.println("Qtd. de vezes que a porta foi aberta: " + abre.getAberturas());
		
	}

}
