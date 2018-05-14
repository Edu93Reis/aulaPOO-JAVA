package user;

import Biblioteca.MenuAdmin;

public class Admin extends User{

	public Admin() {
		super();
	}

	public void Login() {
		MenuAdmin m = new MenuAdmin();
		m.menu();
		
	}
}
