package T1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest g = new Guest("Guest");
		Admin a = new Admin("Admin");
		Bibliotecario b = new Bibliotecario("Bibli");
		
		Login l1 = new Login(g);
		Login l2 = new Login(a);
		Login l3 = new Login(b);
		
		System.out.println(l1.getUsu());
		
		l1.login();
		//l2.login();
		//l3.login();
		
	}

}
