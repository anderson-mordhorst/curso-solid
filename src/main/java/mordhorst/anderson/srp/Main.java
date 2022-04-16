package mordhorst.anderson.srp;

public class Main {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		Item primeiro = new Item();
		primeiro.setNome("Bicicleta");
		primeiro.setValor(740.00);
		
		Item segundo = new Item();
		segundo.setNome("Tapete");
		segundo.setValor(288.73);
		
		pedido.getCarrinho().addItem(primeiro);
		pedido.getCarrinho().addItem(segundo);
	}
}

