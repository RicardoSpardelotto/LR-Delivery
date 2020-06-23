package enums;

public enum TiposLanches {
	X_TUDO(19,"X Tudo"),
	PASTEL(6,"Pastel"),
	COXINHA(4,"Coxinha");
	
	
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
