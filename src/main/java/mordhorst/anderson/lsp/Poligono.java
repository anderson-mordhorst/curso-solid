package mordhorst.anderson.lsp;

import mordhorst.anderson.lsp.poligono.Forma;

public class Poligono {
	
	private Forma forma;
	
	public Forma getForma() {
		return forma;
	}
	
	public void setForma(Forma forma) {
		this.forma = forma;
	}
	
	public float getArea() {
		return forma.getAltura() * forma.getLargura();
	}
}
