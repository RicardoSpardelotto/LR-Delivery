package enums;

public enum TiposLanches {
	X_TUDO(19,"X Tudo"),
	PASTEL(6,"Pastel"),
	COXINHA(4,"Coxinha");
	
	
	private double pre�o;
	private String descricao;
	
	private TiposLanches(double d, String descricao) {
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
