package entidades;

import enums.EstadoEntregador;

public class Entregador extends Pessoa{
	private EstadoEntregador estado;

	public Entregador(String nome, int telefone, EstadoEntregador estado) {
		super(nome, telefone);
		this.estado = estado;
	}

	public EstadoEntregador getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntregador estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Entregador [ " + super.toString() +" / " + estado.getDescricao() + " ]";
	}

	

	

	

	
	
	
	
	
	
	

}
