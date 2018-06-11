package run;

import java.sql.SQLException;

import controller.pessoas.Professor;
import model.ProfessorDAO;

public class PopulaProfessor {
	
	public static void popula() throws SQLException {
	
	// essa classe foi criada para popular a tabela de professores
		
	Professor a = new Professor(0,"adelia"   ,"adelia"   ,"Adelia da Silva Saraiva"	      ,"********", 00000000);
	Professor b = new Professor(0,"alexandre","alexandre","Alexandre Garcia de Oliveira"    ,"********", 00000000);
	Professor c = new Professor(0,"anesio"   ,"anesio"   ,"Anesio Fernandes Freire"         ,"********", 00000000);
	Professor d = new Professor(0,"ayrton"   ,"ayrton"   ,"Ayrton Rogner Coelho Junior"     ,"********", 00000000);
	Professor e = new Professor(0,"ciro"     ,"ciro"     ,"Ciro Cirne Trindade"             ,"********", 00000000);
	Professor f = new Professor(0,"claudio"  ,"claudio"  ,"Claudio Souza Nunes"             ,"********", 00000000);
	Professor g = new Professor(0,"cybelle"  ,"cybelle"  ,"Cybelle Croce Rocha Crane"       ,"********", 00000000);
	Professor h = new Professor(0,"davi"     ,"davi"     ,"Davi Silvestre dos Reis"         ,"********", 00000000);
	Professor i = new Professor(0,"dora"     ,"dora"     ,"Dorotea Vilanova Garcia"         ,"********", 00000000);
	Professor j = new Professor(0,"edna"     ,"edna"     ,"Edna Veloso de Medeiros"         ,"********", 00000000);
	Professor k = new Professor(0,"eliana"   ,"eliana"   ,"Eliana Gregorio Rodrigues"       ,"********", 00000000);
	Professor l = new Professor(0,"gerson"   ,"gerson"   ,"Gerson Prando"                   ,"********", 00000000);
	Professor m = new Professor(0,"gustavo"  ,"gustavo"  ,"Gustavo Abrahão dos Santos"      ,"********", 00000000);
	Professor n = new Professor(0,"nanni"    ,"nanni"    ,"Henrique Cesar Nanni"            ,"********", 00000000);
	Professor o = new Professor(0,"mira"     ,"mira"     ,"Ira Assis Rocha"                 ,"********", 00000000);
	Professor p = new Professor(0,"deus"     ,"deus"     ,"Jamir Mendes Monteiro"           ,"********", 00000000);
	Professor q = new Professor(0,"jason"    ,"jason"    ,"Jason Cesar de Souza Godinho"    ,"********", 00000000);
	Professor r = new Professor(0,"chiara"   ,"chiara"   ,"Jorge Luiz Chiara"		          ,"********", 00000000);
	Professor s = new Professor(0,"pazetti"  ,"pazetti"  ,"Jose Augusto Theodosio Pazetti"  ,"********", 00000000);
	Professor t = new Professor(0,"lourval"  ,"lourval"  ,"Lourval dos Santos Silva"        ,"********", 00000000);
	Professor u = new Professor(0,"prandi"   ,"prandi"   ,"Marcos Fernando Prandi"          ,"********", 00000000);
	Professor v = new Professor(0,"mauricio" ,"mauricio" ,"Mauricio Conceição Mario"        ,"********", 00000000);
	Professor x = new Professor(0,"nadia"    ,"nadia"    ,"Nadia Andrade dos Santos"        ,"********", 00000000);
	Professor w = new Professor(0,"paulo"    ,"paulo"    ,"Paulo Schroeder de Souza"        ,"********", 00000000);
	Professor y = new Professor(0,"rosemeire","rosemeire","Rosemeire Cardozo Vida"          ,"********", 00000000);
	Professor z = new Professor(0,"luigi"    ,"luigi"    ,"Rui Silvestrin"                  ,"********", 00000000);
	Professor aa = new Professor(0,"simone"  ,"simone"   ,"Simone David"                    ,"********", 00000000);
	Professor ab = new Professor(0,"taipina" ,"taipina"  ,"Thiago do Nascimento Taipina"    ,"********", 00000000);
	Professor ac = new Professor(0,"valdir"  ,"valdir"   ,"Valdir Pedro Tobias"             ,"********", 00000000);
	Professor ad = new Professor(0,"vanina"  ,"vanina"   ,"Vanina Carrara Sigrist"          ,"********", 00000000);
	Professor ae = new Professor(0,"walter"  ,"walter"   ,"Walter Garcia Alvares"           ,"********", 00000000);
	
	ProfessorDAO pdao = new ProfessorDAO();
	pdao.createProfessor();
	pdao.insert(a);
	pdao.insert(b);
	pdao.insert(c);
	pdao.insert(d);
	pdao.insert(e);
	pdao.insert(f);
	pdao.insert(g);
	pdao.insert(h);
	pdao.insert(i);
	pdao.insert(j);
	pdao.insert(k);
	pdao.insert(l);
	pdao.insert(m);
	pdao.insert(n);
	pdao.insert(o);
	pdao.insert(p);
	pdao.insert(q);
	pdao.insert(r);
	pdao.insert(s);
	pdao.insert(t);
	pdao.insert(u);
	pdao.insert(v);
	pdao.insert(x);
	pdao.insert(w);
	pdao.insert(z);
	pdao.insert(aa);
	pdao.insert(ab);
	pdao.insert(ac);
	pdao.insert(ad);
	pdao.insert(ae);
	}
	
}
	
	
