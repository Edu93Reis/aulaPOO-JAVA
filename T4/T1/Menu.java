import java.util.Scanner;

public class Menu {
	private Scanner s;
	
	public Menu() {
		this.s = new Scanner(System.in);
	}
	
	public String[] menu() {
		String[] x = new String[2];
		System.out.println("LOGIN");
		System.out.println("Usuário:");
		x[0] = s.next();
		System.out.println("Senha:");
		x[1] = s.next();
		return x;		
	}
}
