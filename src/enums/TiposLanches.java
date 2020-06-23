package enums;

public enum TiposLanches {
	
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
