package T34;

import java.util.Scanner;

public class Regular extends Usuario{
	private String login;
	private Scanner s;
	
	public Regular(String login) {
		super(login);
	}
	
	public void despedidaRegular() {
		System.out.println("At� mais "+ super.login);
	}
	
	public void descreveRegular() {
		System.out.println("Usuario Regular possui permiss�es intermedi�rias de uso do sistema ..");
	}
	
	public void dashboard() {
	  Scanner s = new Scanner(System.in);
		
		 do { 
			System.out.println("Cadastre login: ");
			login = s.nextLine();
		
			if(login.equals(null) || login.equals("")) {
				System.out.println("Campo login n�o pode ser valor vazio. Preencha login!");
			}
		 }while(login.equals(null) || login.equals(""));
		 
	  s.nextLine();	
	}
	
	
}
