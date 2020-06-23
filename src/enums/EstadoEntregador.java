package enums;

public enum EstadoEntregador {
	ENTREGANDO(1,"Entregando"),
	DISPONIVEL(2,"Disponivel");
	
	private int estado;
	private String descricao;
	
	EstadoEntregador(int i,String descricao) {
		this.descricao = descricao;
		this.estado = i;
	}
	
	public int getEstado() {
		return estado;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
