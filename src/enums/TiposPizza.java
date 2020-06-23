package enums;

public enum TiposPizza {
	CALABRESA(28,"Pizza de Calabresa"),
	MUSSARELA(25,"Pizza de Mussarela"),
	FRANGOCOMCATUPIRY(27,"Pizza de Frango com Catupiry");
	
	private double preço;
	private String descricao;
	
	private TiposPizza(double d, String descricao) {
		this.preço = d;
		this.descricao = descricao;
	}

	public double getPreço() {
		return preço;
	}
	public String getDescricao() {
		return descricao;
	}

}
