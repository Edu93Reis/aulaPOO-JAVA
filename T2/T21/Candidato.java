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
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.partido = partido;
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
