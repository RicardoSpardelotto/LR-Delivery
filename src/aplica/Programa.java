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
		Pessoa[] entregador = new Pessoa[3];

		realizaPedido(clientes);
		entregadores(entregador);
		menuPrincipal(clientes);

	}

	public static void entregadores(Pessoa[] entregador) {
		for (int cont = 0; cont < entregador.length; cont++) {
			entregador[cont] = new Entregador("entregador" + cont, cont, EstadoEntregador.DISPONIVEL);
			System.out.println(entregador[cont]);
		}
	}

	public static int ClienteDaCasa(String nome, ArrayList<Cliente> clientes) {
			
		nome = nome.toLowerCase();
		for (int cont=0; cont<clientes.size();cont++) {
			if(clientes.get(cont).getNome().toLowerCase().contains(nome)) {
				return cont;
			}
		}
		return -1;
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

				System.out.println(ClienteDaCasa(nome, clientes));
				
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
		} while (op > 0 && op < 3);
		ler.close();
	}

	public static void realizaPedido(ArrayList<Cliente> clientes,Pessoa[] entregador) {
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
				System.out.println("Informe quantidade");
				int quantidade = ler.nextInt();
				cardapio.aumentaQtd(0,op2,quantidade);
			}
				break;
			case 2: {
				for (TiposBebidas t : TiposBebidas.values()) {
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPreço());
					
				}
				op2 = ler.nextInt();
				System.out.println("Informe quantidade");
				int quantidade = ler.nextInt();
				cardapio.aumentaQtd(1,op2,quantidade);
			}
				break;
			case 3: {
				for (TiposLanches t : TiposLanches.values()) {
					System.out.println(t.getCodigo() + " - " + t.getDescricao() + " R$" + t.getPreço());
				}
				op2 = ler.nextInt();
				System.out.println("Informe quantidade");
				int quantidade = ler.nextInt();
				cardapio.aumentaQtd(2,op2,quantidade);
			}
				break;
			case 4:{
				realizaPagamento(cardapio,clientes,entregador);
			}
			}
		} while (op != 4);

	}
	
	public static void realizaPagamento(Cardapio cardapio,ArrayList<Cliente> clientes,Pessoa[] entregador) {
		Scanner ler = new Scanner(System.in);
		double subtotal = cardapio.calculaSubTotal();
		double desc=0;
		int posi=-1;
		if(subtotal>0) {
			System.out.println("Confirme nome do cliente:");
			String nome = ler.nextLine();
			
			do {
			posi=ClienteDaCasa(nome,clientes);
			if(posi==-1) {
				System.out.println("Nome não encontrado, insira novamente:");
			}
			}while(posi==-1);
			
			if(clientes.get(posi).getVezesCompradas()<10) {
				desc=0;
			}if(clientes.get(posi).getVezesCompradas()<25) {
				desc=0.05;
			}if(clientes.get(posi).getVezesCompradas()<50) {
				desc=0.10;
			}else {
				desc=0.15;
			}
			
			System.out.println("Escolha um entregador de sua preferencia");
			for (int cont = 0; cont < entregador.length; cont++) {
				System.out.print(cont+" ");
				System.out.println(entregador[cont]);
			}
			int op = ler.nextInt();
			entregador[op].setEstadoEntregador(EstadoEntregador.ENTREGANDO);
			for (int cont = 0; cont < entregador.length; cont++) {
				System.out.print(cont+" ");
				System.out.println(entregador[cont]);
			}
			
			System.out.println("total a ser pago: "+(subtotal-(subtotal*desc)));
			ler.nextLine();
			clientes.get(posi).aumentaVezesCompradas();
			System.out.println("Obrigado pela sua preferencia.:)");
			
		}else {
			char op;
			System.out.println("Pedido vazio, deseja refazer o seu pedido?(S/N)");
			op = ler.next().charAt(0);
			if(op=='s'||op=='S'){
				realizaPedido(clientes,entregador);
			}else {
				return;
			}
			
		}
		
	}

}
