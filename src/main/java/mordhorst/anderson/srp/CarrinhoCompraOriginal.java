package mordhorst.anderson.srp;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompraOriginal {
	
	private List<String> itens;
	private String status;
	private Double total;
	
	public CarrinhoCompraOriginal() {
		this.itens = new ArrayList<>();
		this.status = "Aberto";
		this.total = 0.0;
	}	
	
	public void addItem(String item, Double valor) {
		this.itens.add(item);
		this.total += valor;
	}
	
	public List<String> getItens() {
		return itens;
	}
	public void setItens(List<String> itens) {
		this.itens = itens;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}

	public void confirmarPedido() {
		if(validarCarrinho()) {
			this.status = "Confirmado";	
			enviarEmailConfirmacao();			
		}
	}

	private boolean validarCarrinho() {
		return this.itens != null && !this.itens.isEmpty();
	}

	private void enviarEmailConfirmacao() {
		System.out.println("Enviando email de confirmação");		
	}
}
