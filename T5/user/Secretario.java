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
		System.out.println("Digite n�mero da sua op��o: ");
		System.out.println("Op��o 1: Matricular aluno");
		System.out.println("Op��o 2: Encerrar matricula de aluno");
		System.out.println("Op��o 3: Cadastrar professor em mat�ria");
		System.out.println("Op��o 4: Encerrar cadastro de professor em mat�ria");
		System.out.println("Op��o 5: Alterar hor�rio mat�ria");
		System.out.println("Op��o 5: Alterar semestre mat�ria");
		System.out.println("Op��o 7: Sair");
		int opSecretario = s.nextInt();
		
		switch(opSecretario) {
			case 1:
				System.out.println("Digite n�mero de matr�cula do aluno que deseja matricular: ");
				int n = s.nextInt();
				this.matriculaAluno(n);
				System.out.println("Aluno cadastrado com sucesso");
			break;
			case 2:
				System.out.println("Digite n�mero de matr�cula do aluno que deseja encerrar: ");
				int n = s.nextInt();
				this.desmatriculaAluno(n);
				System.out.println("Matr�cula encerrada!");
			break;
			case 3:
				System.out.println("Digite nome da mat�ria: ");
				String materia = s.nextLine();
				System.out.println("Digite carga hor�ria da mat�ria: ");
				double carga = s.nextDouble();
				System.out.println("Digite hor�rio da mat�ria: ");
				String hora = s.nextLine();
				System.out.println("Digite semestre da mat�ria: ");
				int semestre = s.nextInt();				
				this.cadastraProfessorMateria(materia, carga, hora, semestre);
				System.out.println("Professor cadastrado na materia "+ materia +"com sucesso");
			break;
			case 4:
				System.out.println("Digite nome da mat�ria: ");
				String m = s.nextLine();
				System.out.println("Digite carga hor�ria da mat�ria: ");
				double c = s.nextDouble();
				System.out.println("Digite hor�rio da mat�ria: ");
				String h = s.nextLine();
				System.out.println("Digite semestre da mat�ria: ");
				int sem = s.nextInt();				
				this.descadastraProfessorMateria(m, c, h, sem);
				System.out.println("Professor cadastrado na materia "+ materia +"com sucesso");
			break;
			case 5:
				System.out.println("Digite nome da mat�ria: ");
				String nmMateria = s.nextLine();
				System.out.println("Digite novo hor�rio da mat�ria: ");
				Date novoHorario = s.nextInt();				
				this.alteraHorarioMateria(nmMateria, novoHorario);
			break;
			case 6:
				System.out.println("Digite nome da mat�ria: ");
				String nmMat = s.nextLine();
				System.out.println("Digite novo semestre da mat�ria: ");
				int alteraSemestre = s.nextInt();
				this.alteraSemestreMateria(nmMat, alteraSemestre);
			break;
			case 7:
				System.out.println("Saindo...");
				System.exit(0);
			break;
			default:
				System.out.println("Op��o inexistente!");
			break;
		}
	}
}
