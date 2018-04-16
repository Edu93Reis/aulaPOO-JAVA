package T32;

import java.util.Scanner;

import T31.Categoria;

public class MenuCadastro {
	private Scanner s;
	private String nome, tipo;
	private double saldo;
	
	public void tela() {
		s = new Scanner(System.in);
	}
	
	public void menu() {
		int op = 0;
		
			while(op != 7) {
			
			System.out.println("------ Opção 1: Inserir Cliente -------");
			System.out.println("------ Opção 3: Verificar tarifas -------");
			System.out.println("------ Opção 7: Sair  -------");
			System.out.println("-------  Digite opção:  -------");
			op = s.nextInt();
			
			switch(op) {
				case 0:
					addCliente();
				break;
				case 2:
					mostraTarifa();
				case 7:
					sair();
				break;
				default:
					erro();
			}
		
		}
	}
	
	public void erro() {
		System.out.println("Opção inexistente!!");
	}
	
	public void sair() {
		System.out.println("Fim do programa!");
		s.close();
	}
	
	public double mostraTarifa(){
		String cliente;
		
		System.out.println("Digite cliente");
		cliente = s.nextLine();
		
		//for(Entry<String,Aluno> reg : alunos.entrySet()) {
		for(Entry<String, Conta> reg : cliente.entrySet()) {
			if(cliente == )
		}
	}
	
	public void addCliente() {
		System.out.println("Digite tipo do cliente: ");
		tipo = s.nextLine();
		
		if(tipo == "Vip") {
			Vip v  = new Vip(nome, saldo);
		}
		
		System.out.println("Digite nome do cliente: ");
		nome = s.nextLine();
		System.out.println("Digite saldo: ");
		saldo = s.nextDouble();
		
		Cliente c1 = new Cliente();
		
		c1.addCliente(tipo, );
	}
}
