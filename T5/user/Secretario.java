package user;

import java.util.Date;
import java.util.Scanner;
import colegio.Colegio;
import colegio.Integrantes;
import cursos.Curso;

public class Secretario extends Pessoa {
	private Colegio colegio;
	private Curso c;
	private Scanner s;
	
	public Secretario(String n) {
		this.colegio = new Colegio(n);
		this.s = new Scanner(System.in);
	}
	
	public Curso addCurso(String n, double carga) {
		Curso c = new Curso(n, carga);		
		return c;
	}
	
	public void matriculaAluno(int num) {
		c.addAluno(num);
	}
	
	public void desmatriculaAluno(int num) {
		c.removeAluno(num);
	}
	
	public void cadastraProfessorMateria(String materia, double carga, String hora, int semestre){
		c.addProfessor(materia,carga,hora,semestre);
	}
	
	public void descadastraProfessorMateria(String materia, double carga, String hora, int semestre){
		c.removeProfessor(materia,carga,hora,semestre);
	}
	
	public void alteraHorarioMateria(String materia, Date horario){
		c.setHorario(materia, horario);		
	}
	
	public void alteraSemestreMateria(String materia, int semestre) {
		c.setSemestre(materia, semestre);
	}
	
	public void menu() {
		int matricula = 0;
		
		System.out.println("----------------------------------");
		System.out.println("Digite número da sua opção: ");
		System.out.println("Opção 1: Matricular aluno");
		System.out.println("Opção 2: Encerrar matricula de aluno");
		System.out.println("Opção 3: Cadastrar professor em matéria");
		System.out.println("Opção 4: Encerrar cadastro de professor em matéria");
		System.out.println("Opção 5: Alterar horário matéria");
		System.out.println("Opção 5: Alterar semestre matéria");
		System.out.println("Opção 7: Sair");
		int opSecretario = s.nextInt();
		
		switch(opSecretario) {
			case 1:
				System.out.println("Digite número de matrícula do aluno que deseja matricular: ");
				int n = s.nextInt();
				this.matriculaAluno(n);
				System.out.println("Aluno cadastrado com sucesso");
			break;
			case 2:
				System.out.println("Digite número de matrícula do aluno que deseja encerrar: ");
				int n = s.nextInt();
				this.desmatriculaAluno(n);
				System.out.println("Matrícula encerrada!");
			break;
			case 3:
				System.out.println("Digite nome da matéria: ");
				String materia = s.nextLine();
				System.out.println("Digite carga horária da matéria: ");
				double carga = s.nextDouble();
				System.out.println("Digite horário da matéria: ");
				String hora = s.nextLine();
				System.out.println("Digite semestre da matéria: ");
				int semestre = s.nextInt();				
				this.cadastraProfessorMateria(materia, carga, hora, semestre);
				System.out.println("Professor cadastrado na materia "+ materia +"com sucesso");
			break;
			case 4:
				System.out.println("Digite nome da matéria: ");
				String m = s.nextLine();
				System.out.println("Digite carga horária da matéria: ");
				double c = s.nextDouble();
				System.out.println("Digite horário da matéria: ");
				String h = s.nextLine();
				System.out.println("Digite semestre da matéria: ");
				int sem = s.nextInt();				
				this.descadastraProfessorMateria(m, c, h, sem);
				System.out.println("Professor cadastrado na materia "+ materia +"com sucesso");
			break;
			case 5:
				System.out.println("Digite nome da matéria: ");
				String nmMateria = s.nextLine();
				System.out.println("Digite novo horário da matéria: ");
				Date novoHorario = s.nextInt();				
				this.alteraHorarioMateria(nmMateria, novoHorario);
			break;
			case 6:
				System.out.println("Digite nome da matéria: ");
				String nmMat = s.nextLine();
				System.out.println("Digite novo semestre da matéria: ");
				int alteraSemestre = s.nextInt();
				this.alteraSemestreMateria(nmMat, alteraSemestre);
			break;
			case 7:
				System.out.println("Saindo...");
				System.exit(0);
			break;
			default:
				System.out.println("Opção inexistente!");
			break;
		}
	}
}
