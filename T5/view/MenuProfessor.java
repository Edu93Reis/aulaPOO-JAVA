package view;

import java.sql.SQLException;
import java.util.Scanner;

import controller.pessoas.Professor;
import model.AlunoNotasDAO;
import model.MateriaDAO;
import model.ProfessorDAO;

public class MenuProfessor {
	Scanner s;
	Professor p;
	
	public MenuProfessor(Professor p) {
		this.s = new Scanner(System.in);
		this.p = p;
		
	}	
	
	public void menu() throws SQLException{
		
		
		System.out.println("** Bem-vindo, " + p.getNome() + " **");
		System.out.println("** 1- Minhas Matérias");
		System.out.println("** 2- Mudar nota de aluno.");
		System.out.println("** 3- Logout");
		int opt = s.nextInt();
		switch(opt) {
			case 1:
				p.verMaterias(p);
				this.menu();
				break;
			case 2:
				int temp = this.selecionaMateria();
				int temp2 = this.selecionaAluno(temp);
				int nota = this.setNota();
				p.setNotas(temp2, nota, temp);
				this.menu();
				break;
			case 3:	
				this.logout();
				break;
			default:
				break;
		}
		
	}
	
	
	public void logout() throws SQLException {
		MenuLogin.menu();
	}
	
	public int selecionaMateria() throws SQLException {
		System.out.println("Qual o código da matéria que gostaria de editar a nota?");
		MateriaDAO mdao = new MateriaDAO();
		mdao.listarMateriasdoProf(p.getId());
		int materia = s.nextInt();
		return materia;
	}
	
	public int selecionaAluno(int id_materia) throws SQLException {
		System.out.println("Selecione a matrícula do aluno:");
		AlunoNotasDAO andao = new AlunoNotasDAO();
		andao.alunosMatriculadosNaMateria(id_materia, p.getId());
		try {
			int id_aluno = s.nextInt();
			return id_aluno;
		}
		catch(Exception x){
			System.out.println("Matricula inválida");
		}
		return 0;
	}
	
	public int setNota() {
		System.out.println("Qual a nota do aluno?");
		int nota = s.nextInt();
		return nota;
	}

}
