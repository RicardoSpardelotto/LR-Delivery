package enums;

/**
 * Enum para guardar todos os pratos que se enquadram em lanches
 *
 */
public enum TiposLanches {
	X_TUDO(0,19,"X Tudo"),
	PASTEL(1,6,"Pastel"),
	COXINHA(2,4,"Coxinha");
	
	private int codigo;
	private double preco;
	private String descricao;
	
	private TiposLanches(int codigo,double d, String descricao) {
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
