package T21;

import java.util.Scanner;

public class Candidato {
	private String nome, nacionalidade;
	private Partido partido;
	Scanner a;
	
	public void Recebe() {
		a = new Scanner(System.in);
	}
	
	public Candidato(String nome, String nacionalidade, Partido partido) {
		if(nome.equals(null)) {
			System.out.println("Candidato deve possuir nome: ");
			this.nome = a.nextLine();
		}else {
			this.nome = nome;
		}
		if(nacionalidade.equals("")) {
			System.out.println("Candidato deve possuir nacionalidade: ");
			this.nacionalidade = a.nextLine();
		}else {
			this.nacionalidade = nacionalidade;
		}		
			
		if(partido.getNome().equals("") && this.nacionalidade.equals("Brasileiro")) {
				System.out.println("Candidato deve possuir partido registrado!! ");
				
				System.out.println("Digite partido: ");
				String nP = a.nextLine();
				System.out.println("Digite ideologia: ");
				String iD = a.nextLine();
				System.out.println("Digite sigla: ");
				String si = a.nextLine();
				System.out.println("Digite numero: ");
				int num = a.nextInt();
				
				Partido p = new Partido(nP, iD, si, num);
				
				a.close();
		}else {
				this.partido = partido;
		}
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public Partido getPartido() {
		return this.partido;
	} 
	
	// passgem de objeto (conjunto de informa��es)
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
}

/*

Todo partido pol�tico � composto por um nome, uma
ideologia, uma sigla e um n�mero. Um candidato � composto por nome
e um partido. Um candidato pode mudar de partido (neste caso se qualquer regra), 
e suas informa��es dever�o sempre ser mostradas na tela
junto com as informa��es do partido. Todo candidato dever� sempre ter
um partido (caso Brasileiro). Implemente todas as classes envolvidas
nessa situa��o, lembre-se de usar construtores e metodos get, se necess�rio. 
Implemente tamb�m alguns testes.
� pro�bido usar conceitos que ainda n�o foram abordados.

*/
