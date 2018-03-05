package T11;

public class Quantidade {

	public static void main(String[] args) {
			
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Churrasco c1 = new Churrasco();
			p1.nome="Carlos";
			p1.idade=25;
			p1.sexo="Masculino";
			p1.vegetariana=true;
			//não consome
			p2.nome="João";
			p2.idade=15;
			p2.sexo="Masculino";
			p2.vegetariana=false;
			p3.nome="Ana";
			p3.idade=8;
			p3.sexo="Feminino";
			p3.vegetariana=true;
			
			
			c1.verificarConsumo(p1);
			c1.verificarConsumo(p2);
			c1.verificarConsumo(p3);
			
			c1.mediaConsumo(c1.qtCarne, c1.contador);
			c1.totalConsumo();
			
	}
}
