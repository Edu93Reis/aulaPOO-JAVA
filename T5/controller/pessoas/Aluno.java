package controller.pessoas;

import java.sql.SQLException;
import java.util.ArrayList;

import controller.Semestre;
import model.AlunoNotasDAO;

public class Aluno extends Pessoa{
	private int matricula;
	private ArrayList grade;
	private int semestre,curso;
	
	public Aluno(int matricula, String usuario, String senha, String nome, String endereço, int documento, int semestre, int curso) {
		super(usuario, senha, nome, endereço, documento);
		this.semestre = semestre;
		this.matricula = matricula;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public ArrayList getGrade() {
		return grade;
	}
	
	public int getSemestre() {
		return semestre;
	}
	
	public int getCurso() {
		return curso;
	}
	
	public void verNotas(Aluno a) throws SQLException {
		AlunoNotasDAO andao = new AlunoNotasDAO();
		andao.listar(a.matricula);
		
		//adao.listarMateriasMatriculadas(, id_curso);
		
	}
	public void verNotasSemestre(Aluno a) throws SQLException {
		AlunoNotasDAO andao = new AlunoNotasDAO();
		andao.listarSemestre(a.matricula, a.semestre);
		
		//adao.listarMateriasMatriculadas(, id_curso);
		
	}
	
	public void verHorario() {
		
	}
	
}
