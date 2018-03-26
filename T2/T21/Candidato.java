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

Todo partido político é composto por um nome, uma
ideologia, uma sigla e um número. Um candidato é composto por nome
e um partido. Um candidato pode mudar de partido (neste caso se qualquer regra), 
e suas informações deverão sempre ser mostradas na tela
junto com as informações do partido. Todo candidato deverá sempre ter
um partido (caso Brasileiro). Implemente todas as classes envolvidas
nessa situação, lembre-se de usar construtores e metodos get, se necessário. 
Implemente também alguns testes.
É proíbido usar conceitos que ainda não foram abordados.

*/
