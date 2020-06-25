package cardapio;

public class Cardapio {
	private int[][] qtd = new int[3][3];
	
	public Cardapio() {
	}
	
	
	public void mostraQtd() {
		for(int cont=0;cont<qtd.length;cont++) {
			for(int cont1=0;cont1<qtd.length;cont1++) {
				System.out.print(qtd[cont][cont1]);
			}
			System.out.println();
		}
	}
	
	public void aumentaQtd(int x, int y) {
		this.qtd[x][y]++;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
