package T1;

public class Guest extends Usuario{
	private static String senha = "1234@Guest";
	Estante e = new Estante("Nova", Categoria.CI�NCIA);
		
	public Guest(String login) {
		super(login, senha);
	}
	
	public void consulta(String nome) {		
		if(nome == "" || nome == null) {
			System.out.println("Nome inv�lido! Tente novamente");
		}else {
			e.getLivro(nome);
		}		
	}
}
