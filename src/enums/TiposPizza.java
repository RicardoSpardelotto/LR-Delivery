package enums;

public enum TiposPizza {
	
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
