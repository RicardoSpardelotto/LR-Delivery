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
		ArrayList<Cliente> lista = new ArrayList<Cliente>();

		realizaPedido();
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

		for (Cliente obj : clientes) {
			if (nome.equals(obj.getNome().toLowerCase()))
				return true;
		}
		return false;
	}

	public static void menuPrincipal(ArrayList<Cliente> clientes) {
		Scanner ler = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("LR-DELIVERY");
			System.out.println("1 - Já é cadastrado.");
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
					System.out.println("Cliente encontrado, faça seu pedido");
					realizaPedido();
				} else
					System.out.println("Cliente não encontrado, por favor efetue um cadastro");
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
				System.out.println("Informe Endereço:");
				ler.nextLine();
				endereco = ler.nextLine();

				Cliente cliente = new Cliente(nome, telefone, endereco);
				clientes.add(cliente);

			}
			}
		} while (op > 0 || op < 3);
		ler.close();
	}

	public static void realizaPedido() {
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
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPreço());
				}
				op2 = ler.nextInt();
				cardapio.aumentaQtd(0,op2);
			}
				break;
			case 2: {
				for (TiposBebidas t : TiposBebidas.values()) {
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPreço());
				}
				op2 = ler.nextInt();
				cardapio.aumentaQtd(1,op2);
			}
				break;
			case 3: {
				for (TiposLanches t : TiposLanches.values()) {
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPreço());
				}
				op2 = ler.nextInt();
				cardapio.aumentaQtd(2,op2);
			}
				break;
			}
			
		} while (op != 4);
		cardapio.mostraQtd();

	}

}
