package cursos;

import java.util.ArrayList;
import java.util.Date;

import cursos.Materia;
import user.Aluno;
import user.Professor;

public class Curso {
	private String nome;
	private ArrayList<Materia> grade;
	private ArrayList<Aluno> aluno;
	private ArrayList<Professor> professor;
	private ArrayList<Materia> materia;
	private double cargaHoraria;
	
	public Curso(String nome, double cargaHoraria) {
		this.nome = nome;
		this.grade  = new ArrayList<Materia>();
		this.aluno = new ArrayList<Aluno>();
		this.professor = new ArrayList<Professor>();
		this.materia = new ArrayList<Materia>();
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Materia> getGrade() {
		return grade;
	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}	
	
	public void addAluno(int num) {
		Aluno a = new Aluno(num);
		aluno.add(a);
	}
	
	public void removeAluno(int num) {
		Aluno a = new Aluno(num);
		aluno.remove(a);
	}
	
	public void addProfessor(String materia, double carga, String hora, int semestre) {
		Materia m = new Materia("POO",380,"19:00",1);
		Professor p = new Professor(m, 275);
		professor.add(p);
	}
	
	public void removeProfessor(String materia, double carga, String hora, int semestre) {
		Materia m = new Materia(materia,carga,hora,semestre);
		Professor p = new Professor(m, carga);
		professor.add(p);
	}
	
	public void setCargaHoraria(String materia, double cargaHoraria) {
		do {
			if(cargaHoraria <= 0) {
				System.out.println("Carga horária não pode ser menor que zero");
			} else {
				for(Materia m : this.materia)
					if(m.getNome().equals(materia)) {
						m.setCargaHoraria(cargaHoraria);
					}else {
						System.out.println("Matéria inexistente!");
					}				
			}
		}while(cargaHoraria<=0);
	}

	public void setHorario(String materia, Date horario) {
		do{
			if(horario == null) {
				System.out.println("Horário não pode ser campo vazio");
			}else {
				for(Materia m : this.materia)
					if(m.getNome().equals(materia)) {
						m.setHorario(horario);
					}else {
						System.out.println("Matéria inexistente!");
					}
			}
		}while(horario == null);		
	}

	public void setSemestre(String materia, int semestre) {
		for(Materia m : this.materia)
			if(m.getNome().equals(materia)) {
				m.setSemestre(semestre);
			}else {
				System.out.println("Matéria inexistente!");
			}
	}
}
