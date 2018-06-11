package run;

import java.sql.SQLException;

import controller.Materia;
import controller.Semestre;
import model.MateriaDAO;

public class PopulaMateria {
	
	public static void popula() throws SQLException {
		
		// Essa classe foi criada para popular a tabela de Materias da Escola
		
		Materia a = new Materia("Programa��o em microinform�tica"          , 100, Semestre.PRIMEIRO);
		Materia b = new Materia("Algoritmo e L�gico de Programa��o"        , 100, Semestre.PRIMEIRO);
		Materia c = new Materia("Laborat�rio de Hardware"		   		   , 50 , Semestre.PRIMEIRO);
		Materia d = new Materia("Arquitetura e Organiza��o de Computadores", 100, Semestre.PRIMEIRO);
		Materia e = new Materia("Matem�tica Discreta"					   , 100, Semestre.PRIMEIRO);
		Materia f = new Materia("Ingl�s I"								   , 50 , Semestre.PRIMEIRO);
		Materia g = new Materia("Administra��o Geral"					   , 100, Semestre.PRIMEIRO);
		
		Materia h = new Materia("Engenharia de Software I"   		       , 100, Semestre.SEGUNDO);
		Materia i = new Materia("Linguagem de Programa��o"         		   , 100, Semestre.SEGUNDO);
		Materia j = new Materia("Sistemas de Informa��o"          		   , 100, Semestre.SEGUNDO);
		Materia k = new Materia("Contabilidade"          				   , 100, Semestre.SEGUNDO);
		Materia l = new Materia("C�lculo"         					       , 100, Semestre.SEGUNDO);
		Materia m = new Materia("Comunica��o e Express�o"          		   , 100, Semestre.SEGUNDO);
		Materia n = new Materia("Ingl�s II"         					   , 100, Semestre.SEGUNDO);
		
		Materia o = new Materia("Engenharia de Software II"   		       , 100, Semestre.TERCEIRO);
		Materia p = new Materia("Intera��o Humano Computador"   	       , 100, Semestre.TERCEIRO);
		Materia q = new Materia("Estrutura de Dados"   		               , 100, Semestre.TERCEIRO);
		Materia r = new Materia("Sistemas Operacionais I"   		       , 100, Semestre.TERCEIRO);
		Materia s = new Materia("Economia e Finan�as"   		           , 100, Semestre.TERCEIRO);
		Materia t = new Materia("Estat�stica Aplicada"   		           , 100, Semestre.TERCEIRO);
		Materia u = new Materia("Sociedade e Tecnologia"   		           , 100, Semestre.TERCEIRO);
		Materia v = new Materia("Ingl�s III"   		                       , 100, Semestre.TERCEIRO);
		
		Materia x = new Materia("Engenharia de Software III"               , 100, Semestre.QUARTO);
		Materia w = new Materia("Programa��o Orientada a Objeto"           , 100, Semestre.QUARTO);
		Materia y = new Materia("Banco de Dados"   		                   , 100, Semestre.QUARTO);
		Materia z = new Materia("Sistemas Opercionais II"   	           , 100, Semestre.QUARTO);
		Materia aa= new Materia("Programa��o para Mainframe"   	           , 100, Semestre.QUARTO);
		Materia ab= new Materia("Ingl�s IV"   		                       , 100, Semestre.QUARTO);
		
		Materia ac= new Materia("Laborat�rio de Engenharia de Software"    , 100, Semestre.QUINTO);
		Materia ad= new Materia("Seguran�a da Informa��o"                  , 100, Semestre.QUINTO);
		Materia ae= new Materia("Redes de Computadores"                    , 100, Semestre.QUINTO);
		Materia af= new Materia("Laborat�rio de Banco de Dados"            , 100, Semestre.QUINTO);
		Materia ag= new Materia("Eletiva II"   		                       , 100, Semestre.QUINTO);
		Materia ah= new Materia("Programa��o Linear e Aplica��es"          , 100, Semestre.QUINTO);
		Materia ai= new Materia("Ingl�s V"   		                       , 100, Semestre.QUINTO);
		
		Materia aj= new Materia("Gest�o de Projetos"                       , 100, Semestre.SEXTO);
		Materia ak= new Materia("Gest�o e Governan�a de TI"                , 100, Semestre.SEXTO);
		Materia al= new Materia("T�picos Especiais em Inform�tica"   	   , 100, Semestre.SEXTO);
		Materia am= new Materia("Intelig�ncia Artificial"   		       , 100, Semestre.SEXTO);
		Materia an= new Materia("Gest�o de Equipes"   		               , 100, Semestre.SEXTO);
		Materia ao= new Materia("Empreendedorismo"   		               , 100, Semestre.SEXTO);
		Materia ap= new Materia("�tica e Responsabilidade Profissional"    , 100, Semestre.SEXTO);
		Materia aq= new Materia("Ingl�s VI"   		                       , 100, Semestre.SEXTO);
		
		MateriaDAO mdao = new MateriaDAO();
		
		mdao.createMateria();
		mdao.insert(a,1);		mdao.insert(x,1);
		mdao.insert(b,1);		mdao.insert(w,1);
		mdao.insert(c,1);		mdao.insert(y,1);
		mdao.insert(d,1);		mdao.insert(z,1);
		mdao.insert(e,1);		mdao.insert(aa,1);
		mdao.insert(f,1);		mdao.insert(ab,1);
		mdao.insert(g,1);		mdao.insert(ac,1);
		mdao.insert(h,1);		mdao.insert(ad,1);
		mdao.insert(i,1);		mdao.insert(ae,1);
		mdao.insert(j,1);		mdao.insert(af,1);
		mdao.insert(k,1);		mdao.insert(ag,1);
		mdao.insert(l,1);		mdao.insert(ah,1);
		mdao.insert(m,1);		mdao.insert(ai,1);
		mdao.insert(n,1);		mdao.insert(aj,1);
		mdao.insert(o,1);		mdao.insert(ak,1);
		mdao.insert(p,1);		mdao.insert(al,1);
		mdao.insert(q,1);		mdao.insert(am,1);
		mdao.insert(r,1);		mdao.insert(an,1);
		mdao.insert(s,1);		mdao.insert(ao,1);
		mdao.insert(t,1);		mdao.insert(ap,1);
		mdao.insert(u,1);		mdao.insert(aq,1);
		mdao.insert(v,1);		
	}	

}
