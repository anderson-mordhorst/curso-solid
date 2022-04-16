package mordhorst.anderson.lsp.original;

public class Quadrado extends Retangulo {
	
	@Override
	public void setLargura(float largura) {
		super.setLargura(largura);
		this.altura = largura;
	}
	
	@Override
	public void setAltura(float altura) {
		super.setAltura(altura);
		this.largura = altura;
	}
}
