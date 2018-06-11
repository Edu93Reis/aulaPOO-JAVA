package run;

import java.sql.SQLException;

import controller.Curso;
import model.AlunoDAO;
import model.AlunoNotasDAO;
import model.CursoDAO;

public class InserirTabelas {
	
	// essa classe foi criada para, num banco de dados vazio, iniciar todas as tabelas
	
	public void Classe() throws SQLException {
		PopulaProfessor.popula();
		CursoDAO cdao = new CursoDAO();
		cdao.createCurso();
		Curso c = new Curso("Análise e Desenvolvimento de Sistemas", 1);
		cdao.insert(c);
		PopulaMateria.popula();
		AlunoDAO adao = new AlunoDAO();
		adao.createAluno();
		AlunoNotasDAO andao = new AlunoNotasDAO();
		andao.createAlunoNotas();
		
	}

}
