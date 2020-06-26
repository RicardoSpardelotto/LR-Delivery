package entidades;

/**
 * Superclasse que serve para cliente e entregador.
 *
 */
public abstract class Pessoa {
	private String nome;
	private double telefone;
	
	public Pessoa(){
	}
	
	public Pessoa(String nome, double telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return nome;
	}
	
}
