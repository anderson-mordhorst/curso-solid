package mordhorst.anderson.srp;

public class Pedido {

	private String status;
	private CarrinhoCompra carrinho;
	private Double valor;

	public Pedido() {
		this.status = "Aberto";
		this.carrinho = new CarrinhoCompra();
		this.valor = 0.0;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CarrinhoCompra getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoCompra carrinho) {
		this.carrinho = carrinho;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public boolean confirmar() {
		boolean possuiItens = carrinho.hasItens();
		if(possuiItens) {
			status = "Confirmado";
		}
		
		return possuiItens;
	}
}
