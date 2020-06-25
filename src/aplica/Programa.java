package aplica;

import java.util.ArrayList;
import java.util.Scanner;

import cardapio.Cardapio;
import entidades.Cliente;
import entidades.Entregador;
import entidades.Pessoa;
import enums.EstadoEntregador;
import enums.TiposBebidas;
import enums.TiposLanches;
import enums.TiposPizza;

public class Programa {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		realizaPedido(clientes);
		entregadores();
		menuPrincipal(clientes);

	}

	public static void entregadores() {
		Pessoa[] entregador = new Pessoa[3];
		for (int cont = 0; cont < entregador.length; cont++) {
			entregador[cont] = new Entregador("entregador" + cont, cont, EstadoEntregador.DISPONIVEL);
			System.out.println(entregador[cont]);
		}
	}

	public static Boolean ClienteDaCasa(String nome, ArrayList<Cliente> clientes) {

		for (Cliente obj : clientes) {
			if (nome.equals(obj.getNome().toLowerCase()))
				System.out.println(obj);
				return true;
		}
		return false;
	}

	public static void menuPrincipal(ArrayList<Cliente> clientes) {
		Scanner ler = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("LR-DELIVERY");
			System.out.println("1 - J� � cadastrado.");
			System.out.println("2 - Cadastrar.");
			System.out.println("3 - Consultar entregadores.");
			System.out.println("4 - Sair");
			op = ler.nextInt();

			switch (op) {
			case 1: {
				System.out.println("Informe seu nome:");
				ler.nextLine();
				String nome = ler.nextLine();

				if (ClienteDaCasa(nome.toLowerCase(), clientes) == true) {
					System.out.println("Cliente encontrado, fa�a seu pedido");
					realizaPedido(clientes);
				} else
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

				Cliente cliente = new Cliente(nome, telefone, endereco);
				clientes.add(cliente);

			}
			}
		} while (op > 0 || op < 3);
		ler.close();
	}

	public static void realizaPedido(ArrayList<Cliente> clientes) {
		Scanner ler = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		int op;
		int op2;
		do {
			System.out.println("Menu:");
			System.out.println("1-Pizzas");
			System.out.println("2-Bebidas");
			System.out.println("3-Lanches");
			System.out.println("4-Finaliza pedido.");
			op = ler.nextInt();
			switch (op) {
			case 1: {
				for (TiposPizza t : TiposPizza.values()) {
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPre�o());
				}
				op2 = ler.nextInt();
				System.out.println("Informe quantidade");
				int quantidade = ler.nextInt();
				cardapio.aumentaQtd(0,op2,quantidade);
			}
				break;
			case 2: {
				for (TiposBebidas t : TiposBebidas.values()) {
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPre�o());
					
				}
				op2 = ler.nextInt();
				System.out.println("Informe quantidade");
				int quantidade = ler.nextInt();
				cardapio.aumentaQtd(1,op2,quantidade);
			}
				break;
			case 3: {
				for (TiposLanches t : TiposLanches.values()) {
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPre�o());
				}
				op2 = ler.nextInt();
				System.out.println("Informe quantidade");
				int quantidade = ler.nextInt();
				cardapio.aumentaQtd(2,op2,quantidade);
			}
				break;
			case 4:{
				ler.close();
				realizaPagamento(cardapio,clientes);
			}
			}
		} while (op != 4);

	}
	
	public static void realizaPagamento(Cardapio cardapio,ArrayList<Cliente> clientes) {
		Scanner ler = new Scanner(System.in);
		double subtotal = cardapio.calculaSubTotal();
		if(subtotal>0) {
			System.out.println("Confirme nome do cliente:");
			String nome = ler.nextLine();
			ClienteDaCasa(nome,clientes);
		}else {
			char op;
			System.out.println("Pedido vazio, deseja refazer o seu pedido?(S/N)");
			op = ler.next().charAt(0);
			ler.close();
			if(op=='s'||op=='S'){
				realizaPedido(clientes);
			}else {
				return;
			}
			
		}
		
	}

}
