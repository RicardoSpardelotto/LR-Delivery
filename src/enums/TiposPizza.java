package enums;

public enum TiposPizza {
	
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
