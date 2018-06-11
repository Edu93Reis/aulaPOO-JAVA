package controller.pessoas;

import java.sql.SQLException;

import controller.Materia;
import model.AlunoDAO;
import model.AlunoNotasDAO;
import model.MateriaDAO;
import model.ProfessorDAO;

public class Secretario extends Pessoa{

	public Secretario(String usuario, String senha, String nome, String endereço, int documento) {
		super(usuario, senha, nome, endereço, documento);
	}
	
	public void matriculaAluno(Aluno a) throws SQLException {
		try {
			AlunoDAO temp = new AlunoDAO();
			temp.insert(a);
			String usuario = a.getUsuario();
			AlunoNotasDAO andao = new AlunoNotasDAO();
			for(int i=1; i<43; i++) {
				andao.insert(temp.user2(usuario).getMatricula(), i);
			}
		}
		catch(Exception x) {
			
		}
		
	}
	
	public void listarAlunos() throws SQLException {
		AlunoDAO temp = new AlunoDAO();
		temp.listar();
	}
	
	public void trocaSemestre(int matricula, int semestre) throws SQLException {
		AlunoDAO temp = new AlunoDAO();
			temp.alterarSemestre(semestre, matricula);		
	}
	
	public void desmatriculaAluno(int matricula) throws SQLException {
		AlunoDAO temp= new AlunoDAO();
		temp.delete(matricula);
	}
	
	public void listarMaterias() throws SQLException {
		MateriaDAO temp = new MateriaDAO();
		temp.listar();
	}
	
	public void listarProfessores() throws SQLException {
		ProfessorDAO temp = new ProfessorDAO();
		temp.listar();
	}
	
	public void cadastraProfessorMateria(String user_prof, int id_materia) throws SQLException {
		ProfessorDAO pdao = new ProfessorDAO();
		MateriaDAO mdao = new MateriaDAO();
		int id_prof = pdao.returnUser(user_prof);
		mdao.alterarProfessor(id_prof, id_materia);
	}
	
}
