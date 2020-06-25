package enums;

public enum TiposBebidas {
	AGUA(0,2.5,"água"),
	COCACOLA(1,6,"Coca Cola lata"),
	TAUBAIANA(2,5,"Taubaiana lata");
	
	private int codigo;
	private double preco;
	private String descricao;
	
	private TiposBebidas(int codigo,double d, String descricao) {
		this.preco = d;
		this.descricao = descricao;
		this.codigo = codigo;
	}

	public double getPreço() {
		return preco;
	}
	public String getDescricao() {
		return descricao;
	}

	public int getCodigo() {
		return codigo;
	}	

}
