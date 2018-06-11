package controller.pessoas;

import java.sql.SQLException;
import java.util.ArrayList;

import model.AlunoNotasDAO;
import model.MateriaDAO;

public class Professor extends Pessoa{
	private ArrayList grade;
	private double cargaHoraria;
	private int id;
	
	public Professor(int id, String usuario, String senha, String nome, String endereço, int documento) {
		super(usuario, senha, nome, endereço, documento);
		this.id = id;
	}
	public ArrayList getGrade() {
		return grade;
	}
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNotas(int id_aluno, int nota, int id_materia) throws SQLException {
		AlunoNotasDAO andao = new AlunoNotasDAO();
		andao.alterarNota(id_aluno, nota, id_materia);
		
	}

	public void getNotas(Aluno a) {
		
	}
	
	public void verMaterias(Professor p) throws SQLException {
		MateriaDAO mdao = new MateriaDAO();
		mdao.listarMateriasdoProf(p.getId());
	}

	
}
