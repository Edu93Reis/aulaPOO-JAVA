package user;

import Biblioteca.MenuBibliotecario;

public class Bibliotecario extends User{
	
	public Bibliotecario() {
		super();
	}

	public void Login() {
		MenuBibliotecario m = new MenuBibliotecario();
		m.menu();		
	}
	
}
