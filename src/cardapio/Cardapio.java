package cardapio;

import enums.TiposBebidas;
import enums.TiposLanches;
import enums.TiposPizza;

public class Cardapio {
	private int[][] qtd = new int[3][3];
	private double subtotal = 0.0;

	public Cardapio() {
	}

	public void mostraQtd() {
		for (int cont = 0; cont < qtd.length; cont++) {
			for (int cont1 = 0; cont1 < qtd.length; cont1++) {
				System.out.print(qtd[cont][cont1]);
			}
			System.out.println();
		}
	}

	public void aumentaQtd(int x, int y, int z) {
		this.qtd[x][y] = z;
	}

	public double calculaSubTotal() {
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

}
