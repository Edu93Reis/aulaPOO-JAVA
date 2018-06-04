package user;

import cursos.Materia;
import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa{
	private ArrayList<Materia> grade;
	private double cargaHoraria = 0;
	private Scanner s;
	
	public Professor(Materia grade, double cargaHoraria) {
		this.grade = new ArrayList<Materia>();
		this.s = new Scanner(System.in);
		Materia x = new Materia("POO",300.0,"19:00",4);
		Materia y = new Materia("Java",280.5,"20:00",5);
		this.grade.add(x);
		this.grade.add(y);
	}

	public ArrayList<Materia> getGrade() {
		return grade;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void insereNotas() {
		int y = 0;
		System.out.println("Escolha matéria: ");
		for(Materia m: grade) {			
			System.out.println("Opção"+ y +m.getNome());
			y++;
		}
		System.out.println("Digite o nome da matéria: ");
		String op = s.nextLine();
		
		System.out.println("Digite nota: ");
		Double nota = s.nextDouble();
		
		for(Materia m: grade) {			
			if(m.toString().equals(op)) {				
				m.setNota(nota);
			}else {
				System.out.println("Matéria inexistente na grade!");
			}
		}
	}
	
	public double getNotas() {
		for(Materia m : grade) {
			return m.getNota();
		}
		return 0;
	}
	
	public void menu() {		
		System.out.println("----------------------------------");
		System.out.println("Digite número da sua opção: ");
		System.out.println("Opção 1: Dados Completos");
		System.out.println("Opção 2: Grade");
		System.out.println("Opção 3: Carga Horária");
		System.out.println("Opção 4: Inserir Notas");
		System.out.println("Opção 5: Ver Notas");
		System.out.println("Opção 7: Sair");
		int opProfessor = s.nextInt();
		
		switch(opProfessor) {			
			case 1:
				System.out.println("Dados do aluno: "+ this.getNome() + this.getDocumento() +
						this.getEndereco());
			break;
			case 2:
				System.out.println("Grade completa: " + this.getGrade());
			break;
			case 3:
				this.getCargaHoraria();
			break;
			case 4:
				this.insereNotas();
			break;
			case 5:
				this.getNotas();
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
