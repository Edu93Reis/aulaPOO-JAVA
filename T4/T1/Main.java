
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l = new Login();
		try {
			l.CallMenu(l.Validation());
		}
		catch(NullPointerException x) {
			System.out.println("Login inválido");
		}
	}
		
}
