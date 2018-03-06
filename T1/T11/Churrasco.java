package T11;

public class Churrasco {
	double qtCarne = 0;
	int contador = 0;
	
	void verificarConsumo(Pessoa p1){
		
		if(p1.idade<=3 || p1.vegetariana == true){
			qtCarne = qtCarne + 0;
		}else if(p1.idade>3 && p1.idade <=12){
			qtCarne = qtCarne + 1;
		}else{
			qtCarne = qtCarne + 2;
		}
		
		contador++;
		
	}
	
	void mediaConsumo(Double c, int i) {
		double media = c/i;
		System.out.printf("A media de kg de carne por pessoa é: %.2f \n", media, " Kgs");
	}
	
	void totalConsumo()	{
		System.out.println("O total de kg de carne por pessoa é: " + qtCarne + " kgs");	
	}
}
