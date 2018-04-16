package T34;

import java.io.IOException;

public class Sistema {
	public static void main(String[] args) throws IOException {
		Usuario u = new Usuario("Eduardo");		
		u.boasVindas();
		
		Guest g1 = new Guest("Caio");
		g1.boasVindas();
		g1.descreveGuest();
		g1.despedidaGuest();
		
		Regular r1 = new Regular("Felipe");
		r1.boasVindas();
		r1.dashboard();
		r1.descreveRegular();
		r1.despedidaRegular();
		
		Group g2 = new Group("Grupo Python");
		g2.boasVindas();
		g2.descreveGroup();
		g2.groupBoard();
		g2.despedidaGroup();
		
		Root r2 = new Root("root");
		r2.boasVindas();
		r2.descreveRoot();
		r2.excluirTodos();
		r2.despedidaRoot();
		
	}
}
