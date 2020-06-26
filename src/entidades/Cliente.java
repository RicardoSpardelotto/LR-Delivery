package entidades;

/**
 * Classe para aramzenar dados dos clientes conforme são cadastrados e posteriormentes inseridos em uma lista.
 *
 */
public final class Cliente extends Pessoa{
	private String endereco;
	private int vezesCompradas;
	
	public Cliente() {
	}
	
	public Cliente(String nome, int telefone, String endereco) {
		super(nome,telefone);
		this.endereco = endereco;
	}

	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getVezesCompradas() {
		return vezesCompradas;
	}

	public void aumentaVezesCompradas() {
		this.vezesCompradas++;
	}

	

	
}
