package cardapio;

import enums.TiposBebidas;
import enums.TiposLanches;
import enums.TiposPizza;

public class Cardapio {
	private TiposPizza[] pizza;
	private TiposBebidas[] bebidas;
	private TiposLanches[] lanches;
	
	
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
	
	
	
	
	
}
