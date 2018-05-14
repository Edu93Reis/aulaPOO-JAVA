package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private String nome;
	private ArrayList<Estante> estante;
	
	private Scanner s;
	
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.estante = new ArrayList<Estante>();
		this.s = new Scanner(System.in);
		Estante x = new Estante("1",Categoria.CI�NCIA);
		Estante y = new Estante("2",Categoria.FILOSOFIA);
		Livro a = new Livro("Exemplo 1", "Autor 1", 1999);
		Livro b = new Livro("Exemplo 2", "Autor 2", 1997);
		estante.add(x);
		estante.add(y);
		x.insereLivro(a);
		y.insereLivro(b);
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
	
	public void inserirEstante(Estante estante) {
		this.estante.add(estante);
	}
	
	public void criarEstante() {
		String nome;
		Categoria categoria;
		System.out.println("Insira o nome da estante:");
		nome= s.next();
		System.out.println("Insira a categoria da estante:");
		categoria = this.escolheCategoria();
		Estante estante = new Estante(nome,categoria);
		this.inserirEstante(estante);
	}
	
	public ArrayList<Livro> listarFilosofia() {
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
	
	public int contarCiencia() {
		int cont=0;
		for(int i=0; i < estante.size(); i++) {
			if(this.estante.get(i).getCategoria() == Categoria.CI�NCIA) {
				cont = cont + this.estante.get(i).getLivro().size();
			}
		}
	return cont;
	}
			
	public ArrayList<String> listarAutores(Categoria cat){
		ArrayList<String> lista = new ArrayList<String>();
		for (int i = 0; i < estante.size(); i++) {
			if(this.getEstante(i).getCategoria()== cat) {			
				for( int x = 0; x < this.getEstante(i).getLivro().size(); x++) {
					lista.add(this.getEstante(i).getLivro(x).getAutor());
				}
			}
		}
		if (lista.size() == 0) {
			System.out.println("N�o h� autores dessa categoria.");
		}
	return lista;
	}
	
	public void listarTudo() {	
		for(int i=0; i < estante.size(); i++) {
			System.out.println("Estante:" + this.estante.get(i).getNome());
			this.estante.get(i).getLivros();
		}
		
	}
	
	public Categoria escolheCategoria() {
		System.out.println("1 - Filosofia.");
		System.out.println("2 - Ci�ncia.");
		System.out.println("3 - Literatura.");
		int opt = s.nextInt();
		switch(opt) {
			case 1:
				return Categoria.FILOSOFIA;
		case 2:
				return Categoria.CI�NCIA;
		case 3:
				return Categoria.LITERATURA;
		default:
				System.out.println("Op��o inv�lida.");
				this.escolheCategoria();
		}
		return null;
		
	}
}
