package enums;

public enum TiposPizza {
	CALABRESA(28,"Pizza de Calabresa"),
	MUSSARELA(25,"Pizza de Mussarela"),
	FRANGOCOMCATUPIRY(27,"Pizza de Frango com Catupiry");
	
	private double pre�o;
	private String descricao;
	
	private TiposPizza(double d, String descricao) {
		this.pre�o = d;
		this.descricao = descricao;
	}

	public double getPre�o() {
		return pre�o;
	}
	public String getDescricao() {
		return descricao;
	}

}
