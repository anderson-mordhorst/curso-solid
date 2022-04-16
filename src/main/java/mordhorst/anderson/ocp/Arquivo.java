package mordhorst.anderson.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anderson Mordhorst
 *
 */
public abstract class Arquivo {
	
	private List<String> dados;
	
	public Arquivo() {
		this.dados = new ArrayList<String>();
	}
	
	public List<String> getDados() {
		return dados;
	}
	
	public void addLine(String linha) {
		this.dados.add(linha);
	}
	
	public abstract void lerArquivo(String caminho) throws Exception;
}
