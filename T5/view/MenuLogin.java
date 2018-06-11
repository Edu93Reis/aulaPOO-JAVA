package view;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import controller.Escola;
import controller.pessoas.Secretario;
import model.AlunoDAO;
import model.ProfessorDAO;

public class MenuLogin {
	Scanner s;
	static int erro;
	private Secretario maxadmin = new Secretario("maxadmin","maxadmin", "Guri da secretaria","********", 0);
	
	public MenuLogin() {
		this.s = new Scanner(System.in);
	}
	
	public static void menu() throws SQLException {
		System.out.println("** Bem-Vindo à " + Escola.getNome() + " **");
		System.out.println("** Por favor, insira suas credenciais para acessar ao sistema. **");
		MenuLogin temp = new MenuLogin();
		temp.validateLogin();
	}

	public void validateLogin() throws SQLException {
		int	temp;
		try {
			System.out.println("Logar como Aluno(1), Professor(2), Secretário(3) ou Sair(4):");
			temp = s.nextInt();
			switch(temp) {
				case 1: this.loginAluno();
					break;
				case 2: this.loginProfessor();
					break;
				case 3: this.loginSecretario();
					break;
				case 4:
					System.out.println("Fim.");
					break;
				default: System.out.println("Opção inválida");
					this.erro();
					break;
				}
		}
		catch(InputMismatchException x) {
			System.out.println("Erro. O terminal está sendo desligado.");
		}
	}
	
	public void loginAluno() throws SQLException {
		System.out.println("** Login Aluno **");
		System.out.println("** Usuário:");
		String login = s.next();
		System.out.println("** Senha:");
		String senha = s.next();
		AlunoDAO adao = new AlunoDAO();
		if(adao.user(login, senha)!=null) {
			MenuAluno ma = new MenuAluno(adao.user(login, senha));
			ma.menu();
		}
		else {
			this.erro();
		}
	}

	public void loginProfessor() throws SQLException {
		System.out.println("** Login Professor **");
		System.out.println("** Usuário:");
		String login = s.next();
		System.out.println("** Senha:");
		String senha = s.next();
		ProfessorDAO pdao = new ProfessorDAO();
		if(pdao.user(login, senha)!=null) {
			MenuProfessor ma = new MenuProfessor(pdao.user(login, senha));
			ma.menu();
		}
		else {
			this.erro();
		}
	}
	
	public void loginSecretario() throws SQLException {
		System.out.println("** Login Secretario **");
		System.out.println("** Usuário:");
		String login = s.next();
		System.out.println("** Senha:");
		String senha = s.next();
		this.validateSecretario(login, senha);
	}
	
	public void erro() throws SQLException {
		if(erro<2) {
			erro++;
			System.out.println("Após 3 tentativas, o terminal será fechado.");
			System.out.println("Tentativas:" + erro);
			this.validateLogin();
		}
		else {
			System.out.println("O terminal está sendo desligado.");
		}

	}
	
	public void validateSecretario(String login, String senha) throws SQLException {
		if(login.equals("maxadmin") && senha.equals("maxadmin")) {
			MenuSecretario m = new MenuSecretario();
			m.menu(maxadmin);
		}
		else {
			this.erro();
		}
	}

}
