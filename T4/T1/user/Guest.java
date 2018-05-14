package user;
import Biblioteca.MenuGuest;

public class Guest extends User{

	public Guest() {
		super();
	}

	public void Login() {
		MenuGuest m = new MenuGuest();
		m.menu();
	}
}
