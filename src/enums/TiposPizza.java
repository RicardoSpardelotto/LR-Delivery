package enums;

public enum TiposPizza {
	CALABRESA(0,28,"Pizza de Calabresa"),
	MUSSARELA(1,25,"Pizza de Mussarela"),
	FRANGOCOMCATUPIRY(2,27,"Pizza de Frango com Catupiry");
	
	private int codigo;
	private double preco;
	private String descricao;
	
	private TiposPizza(int codigo, double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
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
