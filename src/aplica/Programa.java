package aplica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Entregador;
import entidades.Pessoa;
import enums.EstadoEntregador;

public class Programa {

	public static void main(String[] args) {
		ArrayList<Cliente> lista  = new ArrayList<Cliente>();
	

		entregadores();
		menuPrincipal(lista);

	}

	public static void entregadores() {
		Pessoa[] entregador = new Pessoa[3];
		for (int cont = 0; cont < entregador.length; cont++) {
			entregador[cont] = new Entregador("entregador" + cont, cont, EstadoEntregador.DISPONIVEL);
			System.out.println(entregador[cont]);
		}
	}
	
	public static Boolean ClienteDaCasa(String nome, ArrayList<Cliente> clientes) {

		for(Cliente obj: clientes) {
			if(nome.equals(obj.getNome())) 
				return true;
			}
		return false;
	}

	public static void menuPrincipal(ArrayList<Cliente> clientes) {
		Scanner ler = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("OL�, BEM VINDO AO LR-DELIVERY");
			System.out.println("1 - J� sou da casa.");
			System.out.println("2 - Quero me cadastrar.");
			System.out.println("3 - Sair");
			op = ler.nextInt();
		
		switch (op) {
		case 1: {
			System.out.println("Informe seu nome:");
				ler.nextLine();	
				String nome = ler.nextLine();
				
				if(ClienteDaCasa(nome, clientes) == true)
					System.out.println("Cliente encontrado, fa�a seu pedido");			
				else
					System.out.println("Cliente n�o encontrado, por favor efetue um cadastro");
		}
			break;
		case 2: {
			String nome;
			int telefone;
			String endereco;
			
			System.out.println("Informe seu Nome:");
			ler.nextLine();
			nome = ler.nextLine();
			System.out.println("informe telefone:");
			telefone = ler.nextInt();
			System.out.println("Informe Endere�o:");
			ler.nextLine();
			endereco = ler.nextLine();
			
			Cliente cliente = new Cliente(nome,telefone,endereco);
			clientes.add(cliente);
			
		}
		}
		} while (op > 1 || op < 3);
		ler.close();
	}

}
