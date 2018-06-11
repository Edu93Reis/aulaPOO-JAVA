package controller;

import controller.pessoas.Professor;

public class Materia {
	private String nome;
	private int cargaHoraria;
	private int semestre;
	private Professor professor;
	
	public Materia(String nome, int cargaHoraria, int semestre) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.semestre = semestre;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public int getSemestre() {
		return semestre;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor p) {
		this.professor = p;
	}

}
