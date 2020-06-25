package entidades;

public class Cliente extends Pessoa{
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

	

	
}
