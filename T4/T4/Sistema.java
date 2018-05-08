package T4;

public class Sistema {
	public static void main(String[] args) {
		Usuario u = new Usuario("Eduardo");		
		u.boasVindas();
		
		Guest g1 = new Guest("Caio");
		g1.boasVindas();
		u.descreve(g1);
		u.despedida(g1);
		
		Regular r1 = new Regular("Felipe");
		r1.boasVindas();
		r1.dashboard();
		u.descreve(r1);
		u.despedida(r1);
		
		Group g2 = new Group("Grupo Python");
		g2.boasVindas();
		u.descreve(g2);
		g2.groupBoard();
		u.despedida(g2);
		
		Root r2 = new Root("root");
		r2.boasVindas();
		u.descreve(r2);
		r2.excluirTodos();
		u.despedida(r2);
		
	}
}
