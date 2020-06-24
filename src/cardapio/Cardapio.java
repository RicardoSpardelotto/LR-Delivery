package cardapio;

import java.util.Arrays;

import enums.TiposBebidas;
import enums.TiposLanches;
import enums.TiposPizza;

public class Cardapio {
	private TiposPizza[] pizza;
	private TiposBebidas[] bebidas;
	private TiposLanches[] lanches;
	private double total;
	
	
	public TiposPizza[] getPizza() {
		return pizza;
	}
	public void setPizza(TiposPizza[] pizza) {
		this.pizza = pizza;
	}
	public TiposBebidas[] getBebidas() {
		return bebidas;
	}
	public void setBebidas(TiposBebidas[] bebidas) {
		this.bebidas = bebidas;
	}
	public TiposLanches[] getLanches() {
		return lanches;
	}
	public void setLanches(TiposLanches[] lanches) {
		this.lanches = lanches;
	}
	
	@Override
	public String toString() {
		return "Cardapio [pizza=" + Arrays.toString(pizza) + ", bebidas=" + Arrays.toString(bebidas) + ", lanches="
				+ Arrays.toString(lanches) + "]";
	}
	
	
	
	
	
	
	
}
