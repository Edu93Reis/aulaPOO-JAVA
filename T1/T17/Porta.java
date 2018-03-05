package T17;

public class Porta {
	//atributos da classe porta
	int numAberturas = 0;
	boolean isOpen;
	
	//metodo abrir seta atributo isOpen como true para abrir apenas se porta estiver fechada (false) e acumula 1
	//para a contagem de vezes que a porta foi aberta
	public void abrir(){
		if(this.isOpen == false) {
			this.isOpen = true;
			numAberturas ++;
		} else {
			System.out.println("Cavalo! A porta já está aberta!!");
		}
	}
	
	//metodo fechar fecha a porta apenas se ela estiver aberta (true), do contrario retorna eero
	public void fechar() {
		if(this.isOpen == true) {
			this.isOpen = false;
		} else {
			System.out.println("Mateus, você é burro! A porta já está fechada!");
		}
	}
	
	//metodo getter para acesso de outros metodos e classes à quantidade de vezes em que a porta foi aberta
	public int getAberturas() {
		return numAberturas;
	}
}
