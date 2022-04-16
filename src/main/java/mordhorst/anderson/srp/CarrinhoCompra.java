package mordhorst.anderson.srp;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	
	private List<Item> itens = new ArrayList<>();
	
	public List<Item> getItens() {
		return itens;
	}
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public boolean hasItens() {
		return !itens.isEmpty();
	}
}
