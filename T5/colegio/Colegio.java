package colegio;
import java.util.ArrayList;
import java.util.Scanner;

import cursos.*;
import user.*;

public class Colegio {
	private String nome;
	private int opcao;
	private ArrayList<Curso> curso;
	private Scanner s;
	
	public Colegio(String nome) {
		this.nome = nome;
		this.curso = new ArrayList<Curso>();
		this.s = new Scanner(System.in);
	}
	
	public void logar(Pessoa integrante, String user,String senha) {
		String op = integrante.getClass().toString();
		
		if(user.equals(integrante.getNome()) && senha.equals(integrante.getSenha())){
			if(op.equals(Integrantes.Tipo1.getTipo())){
				//secretario
				this.verColegio();
				integrante.menu();
			}else if(op.equals(Integrantes.Tipo2.getTipo())) {
				//professor
				this.verColegio();
				integrante.menu();
			}else if(op.equals(Integrantes.Tipo3.getTipo())) {
				//aluno
				this.verColegio();
				integrante.menu();
			}else {
				System.out.println("Opção inexistente!!");
			}
		}else {
			System.out.println("Senha ou usuário inválidos!");
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		do {
			if(nome.equals(null) || nome.equals("")) {
				this.nome = nome;
			}else {
				System.out.println("Nome não deve ficar em branco!!");
			}
		}while(nome.equals(null) || nome.equals(""));		
	}

	public void verColegio() {
		System.out.println("Bem-vindo ao sistema do colégio: " + this.getNome());
	}
}
