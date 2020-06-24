package enums;

public enum TiposPizza {
	CALABRESA(28,"Pizza de Calabresa"),
	MUSSARELA(25,"Pizza de Mussarela"),
	FRANGOCOMCATUPIRY(27,"Pizza de Frango com Catupiry");
	
	private double preco;
	private String descricao;
	
	private TiposPizza(double d, String descricao) {
		this.preco = d;
		this.descricao = descricao;
	}

	public double getPreço() {
		return preco;
	}
	public String getDescricao() {
		return descricao;
	}

}
