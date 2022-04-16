package mordhorst.anderson.ocp;

import java.util.List;

public class Leitor {
	
	private String diretorio;
	private String arquivo;
	
	public String getDiretorio() {
		return diretorio;
	}
	
	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
	
	public String getArquivo() {
		return arquivo;
	}
	
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	public List<String> lerArquivo() throws Exception {
		String caminho = getDiretorio().concat("\\").concat(getArquivo());
		Arquivo a = null;
		
		if(getArquivo().endsWith("csv")) {
			a = new Csv();	
		}
		else {
			a = new Txt();
		}
				
		a.lerArquivo(caminho);
		return a.getDados();
	}
}
