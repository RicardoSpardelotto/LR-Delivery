package enums;

public enum TiposBebidas {
	AGUA(2.5,"água"),
	COCACOLA(6,"Coca Cola lata"),
	TAUBAIANA(5,"Taubaiana lata");
	
	private double preço;
	private String descricao;
	
	private TiposBebidas(double d, String descricao) {
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
