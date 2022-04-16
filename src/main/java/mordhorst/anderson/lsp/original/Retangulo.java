package mordhorst.anderson.lsp.original;

public class Retangulo {
	
	protected float largura, altura;
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public float getLargura() {
		return largura;
	}
	
	public float getArea() {
		return altura * largura;
	}
}
