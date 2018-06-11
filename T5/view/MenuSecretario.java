package view;

import java.sql.SQLException;
import java.util.Scanner;

import org.postgresql.util.PSQLException;

import controller.Semestre;
import controller.pessoas.Aluno;
import controller.pessoas.Secretario;

public class MenuSecretario {
	Scanner s,w,e,t,j, m, k;
	
	public MenuSecretario() {
		this.s = new Scanner(System.in);
		this.w = new Scanner(System.in);
		this.e = new Scanner(System.in);
		this.t = new Scanner(System.in);
		this.j = new Scanner(System.in);
		this.m = new Scanner(System.in);
		this.k = new Scanner(System.in);
	}	
	
	public void menu(Secretario x) throws SQLException{
		
		
		System.out.println("** Bem-vindo, " + x.getNome() + " **");
		System.out.println("** 1- Matricular aluno.");
		System.out.println("** 2- Listar alunos.");
		System.out.println("** 3- Trocar semestre de aluno.");
		System.out.println("** 4- Listar Matérias.");
		System.out.println("** 5- Listar Professores.");		
		System.out.println("** 6- Cadastrar Professor em uma máteria.");
		System.out.println("** 7- Logout.");
		int opt = s.nextInt();
		switch(opt) {
			case 1:
				try {
					x.matriculaAluno(this.recebeAluno());
					System.out.println("Aluno matriculado com sucesso.");
					this.menu(x);
				}
				catch(PSQLException x1) {
					System.out.println("Erro ao matricular o aluno");
					this.menu(x);
				}
				break;
			case 2:
				x.listarAlunos();
				this.menu(x);
				break;
			case 3:
				x.trocaSemestre(this.trocaSemestre(), this.recebeSemestre());
				this.menu(x);
				break;
			case 4:
				x.listarMaterias();
				this.menu(x);
				break;
			case 5:
				x.listarProfessores();
				this.menu(x);
				break;
			case 6:
				x.cadastraProfessorMateria(this.retornaProfessor(), this.retornaMateria());
				this.menu(x);
				break;
			case 7:	
				this.logout();
				break;
			default:
				break;
		}
		
	}
	
	
	public void logout() throws SQLException {
		MenuLogin.menu();
	}
	
	public Aluno recebeAluno() {
		System.out.println("Insira o nome do aluno.");
		String nome = w.nextLine();
		System.out.println("Insira o numero do documento do aluno.");
		int documento = s.nextInt();
		System.out.println("Insira o endereço do aluno.");
		String endereço = e.nextLine();
		System.out.println("Insira um usuario para o aluno.");
		String usuario = t.next();
		System.out.println("Insira a senha do aluno.");
		String senha = j.next();
		System.out.println("Insira o código do curso.");
		int curso = k.nextInt();
		Aluno temp = new Aluno(0, usuario, senha, nome, endereço, documento, Semestre.PRIMEIRO, curso);
		return temp;
	}
	
	public int trocaSemestre() {
		System.out.println("Insira o número de matrícula do aluno.");
		int temp = m.nextInt();
		return temp;
	}
	
	public int recebeSemestre() {
		System.out.println("Insira o numero do novo semestre");
		int temp = m.nextInt();
		if (temp<=0 || temp>6){
			System.out.println("Semestre inválido");
			this.recebeSemestre();
		}
		return temp;
	}
	
	public String retornaProfessor() {
		System.out.println("Digite o nome de usuario do Professor.");
		String temp = s.next();
		return temp;
	}
	
	public int retornaMateria() {
		System.out.println("Digite o código da matéria que deseja atribuir ao professor.");
		int temp = s.nextInt();
		return temp;
	}

}