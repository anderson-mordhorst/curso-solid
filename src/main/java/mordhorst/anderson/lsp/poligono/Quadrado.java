package mordhorst.anderson.lsp.poligono;

public class Quadrado implements Forma {
	
	protected float largura, altura;		
	
	public float getAltura() {
		return altura;
	}
	
	public float getLargura() {
		return largura;
	}
	
	@Override
	public void setAltura(float altura) {
		this.altura = altura;
		this.largura = altura;
	}
	
	@Override
	public void setLargura(float largura) {
		this.largura = largura;
		this.altura = largura;
	}
}
