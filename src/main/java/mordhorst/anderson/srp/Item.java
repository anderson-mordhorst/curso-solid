package mordhorst.anderson.srp;

public class Item {
	
	private String nome;
	
	private Double valor;
		
	public Item() {
		this.nome = "";
		this.valor = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
