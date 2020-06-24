package enums;

public enum TiposBebidas {
	AGUA(2.5,"�gua"),
	COCACOLA(6,"Coca Cola lata"),
	TAUBAIANA(5,"Taubaiana lata");
	
	private double preco;
	private String descricao;
	
	private TiposBebidas(double d, String descricao) {
		this.preco = d;
		this.descricao = descricao;
	}

	public double getPre�o() {
		return preco;
	}
	public String getDescricao() {
		return descricao;
	}
	
	

}
