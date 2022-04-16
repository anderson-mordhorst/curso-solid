package mordhorst.anderson.lsp;

import mordhorst.anderson.lsp.poligono.Quadrado;
import mordhorst.anderson.lsp.poligono.Retangulo;

public class Main {

	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		r.setLargura(10f);
		r.setAltura(5f);
		
		Quadrado q = new Quadrado();
		q.setAltura(5f);
		
		Poligono poligono = new Poligono();
		poligono.setForma(r);
		System.out.println("Área do poligono retangulo: " + poligono.getArea());
		
		poligono.setForma(q);
		System.out.println("Área do poligono quadrado: " + poligono.getArea());
	}
}
