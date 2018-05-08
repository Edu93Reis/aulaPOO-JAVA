package T1;

public class Guest extends Usuario{
	private static String senha = "1234@Guest";
		
	public Guest(String login) {
		super(login, senha);
	}
}
