package T16;

public class eq2Grau {
	//atributos para calculo da equacao 
	double a, b, c;
	
	//metodo construtor para passagem dos parametros para calculo da equacao
	public void eq2Grau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//delta(): retorna o delta da equacao;
	public double delta() {
		double delta = (Math.pow(b,2))-4*a*c;
		return delta;
	}
	
	//retorna a primeira raiz se delta ≥ 0, se não retorna NaN;
	public double raiz1() {
		double x1 = (-b + (Math.sqrt(delta())))/2*a;
		
			if(x1>=0) {
				return x1;
			}else {
				return Double.NaN;
			}
		
	}
	
	//retorna a segunda raiz se delta ≥ 0, se não retorna NaN
	public double raiz2() {
		double x2 = (-b - (Math.sqrt(delta())))/2*a;
		
			if( x2 >= 0 ) {
				return x2;
			} else {
				return Double.NaN;
			}
	}
}
