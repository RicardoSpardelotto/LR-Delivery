package enums;

public enum TiposLanches {
	
	private double preço;
	private String descricao;
	
	private TiposLanches(double d, String descricao) {
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
