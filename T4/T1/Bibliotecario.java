package T1;

public class Bibliotecario extends Usuario{
	private static String senha = "1234@Bibli";
	Menu m = new Menu();
	Biblioteca b = new Biblioteca("Principal");
	
	public Bibliotecario(String login) {
		super(login, senha);
	}
	
	public void insereLivro() {
		int option = m.escolheEstante();
		b.getEstante(option).insereLivro(b.getEstante(option).criaLivro());
	}
}
