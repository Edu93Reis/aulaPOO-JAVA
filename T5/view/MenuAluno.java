package view;

import java.sql.SQLException;
import java.util.Scanner;

import controller.pessoas.Aluno;

public class MenuAluno {
	Scanner s;
	Aluno a;
	
	public MenuAluno(Aluno a) {
		this.s = new Scanner(System.in);
		this.a = a;
		
	}	
	
	public void menu() throws SQLException{
		
		
		System.out.println("** Bem-vindo, " + a.getNome() + " **");
		System.out.println("** 1- Histórico.");
		System.out.println("** 2- Notas Parciais.");
		System.out.println("** 3- Logout");
		int opt = s.nextInt();
		switch(opt) {
			case 1:
				a.verNotas(a);
				this.menu();
				break;
			case 2:
				a.verNotasSemestre(a);
				this.menu();
				break;
			case 3:	
				this.logout();
				break;
			default:
				break;
		}
		
	}
	
	
	public void logout() throws SQLException {
		MenuLogin.menu();
	}

}