package enums;

public enum TiposBebidas {
	AGUA(2.5,"�gua"),
	COCACOLA(6,"Coca Cola lata"),
	TAUBAIANA(5,"Taubaiana lata");
	
	private double pre�o;
	private String descricao;
	
	private TiposBebidas(double d, String descricao) {
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
