package t31;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private String nome;
	private ArrayList<Estante> estante;
	
	Scanner s;
	
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.estante = new ArrayList<Estante>();
		this.s = new Scanner(System.in);
	}
	public String getNome() {
		return nome;
	}
	public Estante getEstante(int i) {
		return estante.get(i);
	}
	
	public ArrayList getEstante() {
		return estante;
	}
	
	void inserirEstante(Estante estante) {
		this.estante.add(estante);
	}
	
	void criarEstante() {
		String nome;
		Categoria categoria;
		System.out.println("Insira o nome da estante:");
		nome= s.next();
		System.out.println("Insira a categoria da estante:");
		categoria = Categoria.valueOf(s.next());
		Estante estante = new Estante(nome,categoria);
		this.inserirEstante(estante);
	}
	
	ArrayList<Livro> listarFilosofia() {
		ArrayList<Livro> novo = new ArrayList<Livro>();
		for(int i=0; i < estante.size(); i++) {
			if(this.estante.get(i).getCategoria() == Categoria.FILOSOFIA) {
				for(int x = 0; x < this.estante.get(i).getLivro().size(); x++) {
					novo.add(this.estante.get(i).getLivro(x));
				}
			}
		}
	return novo;
	}
	
	int contarCiencia() {
		int cont=0;
		for(int i=0; i < estante.size(); i++) {
			if(this.estante.get(i).getCategoria() == Categoria.CI�NCIA) {
				cont = cont + this.estante.get(i).getLivro().size();
			}
		}
	return cont;
	}
			
	ArrayList<String> listarAutores(Categoria cat){
		ArrayList<String> lista = new ArrayList<String>();
		for (int i = 0; i < estante.size(); i++) {
			if(this.getEstante(i).getCategoria()== cat) {			
				for( int x = 0; x < this.getEstante(i).getLivro().size(); x++) {
					lista.add(this.getEstante(i).getLivro(x).getAutor());
				}
			}
		}
	return lista;
	}
	
	void listarTudo() {	
		for(int i=0; i < estante.size(); i++) {
			System.out.println("Estante:" + this.estante.get(i).getNome());
			this.estante.get(i).getLivros();
		}
		
	}
}
