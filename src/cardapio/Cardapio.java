package cardapio;

import enums.TiposBebidas;
import enums.TiposLanches;
import enums.TiposPizza;
/**
 * Classe para gestao do cardapio
 * 
 */
public final class Cardapio {
	private int[][] qtd = new int[3][3];
	private double subtotal = 0.0;

	public Cardapio() {
	}

	public void aumentaQtd(int x, int y, int z) {
		/**
		 * método para guardar a quantidade de cada prato escolhido.
		 * @param x é o tipo de produto, y é o produto, z é a quantidade.
		 */
		this.qtd[x][y] = z;
	}

	public double calculaSubTotal() {
		/**
		 * método para calcular subtotal do pedido.
		 */
		subtotal=0;
		int cont = 0;
		for (TiposPizza t : TiposPizza.values()) {
			subtotal += qtd[0][cont] * t.getPreço();
			cont++;
		}
		cont = 0;
		for (TiposBebidas t : TiposBebidas.values()) {
			subtotal += qtd[1][cont] * t.getPreço();
			cont++;
		}
		cont = 0;
		for (TiposLanches t : TiposLanches.values()) {
			subtotal += qtd[2][cont] * t.getPreço();
			cont++;
		}
		return this.subtotal;
	}
	
	public void mostraPedido() {
		int cont = 0;
		for (TiposPizza t : TiposPizza.values()) {
			if(qtd[0][cont]!=0) {
			System.out.println(qtd[0][cont]+" Unidades de "+ t.getDescricao());
			}
			cont++;
		}
		cont = 0;
		for (TiposBebidas t : TiposBebidas.values()) {
			if(qtd[1][cont]!=0) {
				System.out.println(qtd[1][cont]+" Unidades de "+ t.getDescricao());
				}
				cont++;
		}
		cont = 0;
		for (TiposLanches t : TiposLanches.values()) {
			if(qtd[2][cont]!=0) {
				System.out.println(qtd[2][cont]+" Unidades de "+ t.getDescricao());
				}
				cont++;
		}
		System.out.println("Subtotal: " + calculaSubTotal());
	}

}
