package user;

import java.util.ArrayList;
import java.util.Scanner;
import cursos.Materia;

public class Aluno extends Pessoa{
	private int matricula = 0;
	private ArrayList<Materia> grade;
	private Scanner s;
	private String usuario;
	private String senha;
	
	public Aluno(int matricula) {
		this.matricula = matricula;
		this.grade = new ArrayList<Materia>();
		Materia x = new Materia("POO",300.0,"19:00",4);
		Materia y = new Materia("Java",280.5,"20:00",5);
		grade.add(x);
		grade.add(y);
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public ArrayList<Materia> getGrade(){
		return grade;
	}
	
	/*public Materia getMaterias() {
		for(Materia m : grade) {
			return m;
		}
		return null;
	}*/
	
	public void verNotas() {
		for(Materia m: grade) {
			System.out.println("Mat�ria: " + m.getNome()+ "Nota: " + m.getNota());
		}
	}
	
	public void verHorario() {
		for(Materia m: grade){
			System.out.println("Mat�ria: " + m.getNome()+ "Hor�rio" + m.getHorario());
		}
	}
	
	public void menu() {						
		System.out.println("----------------------------------");
		System.out.println("Digite n�mero da sua op��o: ");
		System.out.println("Op��o 1: N�mero Matr�cula");
		System.out.println("Op��o 2: Dados Completo");
		System.out.println("Op��o 3: Grade");
		System.out.println("Op��o 4: Nota");
		System.out.println("Op��o 5: Hor�rio");
		System.out.println("Op��o 7: Sair");
		int opAluno = s.nextInt();
		
		switch(opAluno) {
			case 1:
				System.out.println("Matr�cula: "+ this.getMatricula());
			break;
			case 2:
				System.out.println("Dados do aluno: "+ this.getNome() + this.getDocumento() +
						this.getEndereco());
			break;
			case 3:
				System.out.println("Grade completa: " + this.getGrade());
			break;
			case 4:
				this.verNotas();
			break;
			case 5:
				this.verHorario();
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
