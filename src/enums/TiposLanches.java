package enums;

public enum TiposLanches {
	X_TUDO(19,"X Tudo"),
	PASTEL(6,"Pastel"),
	COXINHA(4,"Coxinha");
	
	
	private double preco;
	private String descricao;
	
	private TiposLanches(double d, String descricao) {
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
