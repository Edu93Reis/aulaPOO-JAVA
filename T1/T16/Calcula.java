package T16;

public class Calcula {
	public static void main(String[] args) {
		eq2Grau calc = new eq2Grau();
		
		calc.eq2Grau(1d, -2d, -3d);
		calc.delta();
		System.out.print("A primeira solucao para ");
		//printf("A primeira solucao para %d, %d, %d e: %.2d", calc.a, calc.b, calc.c, calc.raiz2());
		System.out.printf("%.2f, %.2f, %.2f, %s %.2f \n", calc.a, calc.b, calc.c , "é: " ,calc.raiz1());
		
		System.out.print("A segunda solucao para ");
		System.out.printf("%.2f, %.2f, %.2f, %s %.2f \n", calc.a, calc.b, calc.c , "é: " ,calc.raiz2());
	}
}
