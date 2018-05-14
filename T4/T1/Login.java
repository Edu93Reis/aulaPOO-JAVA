
import user.Admin;
import user.Bibliotecario;
import user.Guest;
import user.User;

public class Login {
	private String  admin="admin";
	private String  bibliotecario="bibliotecario";
	private String  guest="guest";

	
	
	public User Validation() {
		Menu m = new Menu();
		String[] x = new String[2];
		x = m.menu();
		if (x[0].equals(admin) && x[1].equals(admin)){
			Admin temp = new Admin();
			return temp;
		}
		else if(x[0].equals(bibliotecario) && x[1].equals(bibliotecario)) {
			Bibliotecario temp = new Bibliotecario();
			return temp;
		}
		else if(x[0].equals(guest) && x[1].equals(guest)) {
			Guest temp = new Guest();
			return temp;
		}
		return null;
	}

	
	public void CallMenu(User x) {
		if (x.equals(null)) {
			System.out.println("Fim...");
		}
		x.Login();
	}

}
