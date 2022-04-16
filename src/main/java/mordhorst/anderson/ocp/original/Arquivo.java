package mordhorst.anderson.ocp.original;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arquivo {
	
	private List<String> dados;
	
	public Arquivo() {
		this.dados = new ArrayList<String>();
	}
	
	public List<String> getDados() {
		return dados;
	}
	
	public void lerArquivoCSV(String caminho) throws Exception {
		try (FileReader reader = new FileReader(caminho); BufferedReader buffReader = new BufferedReader(reader)){
			String line = null;
			while ((line = buffReader.readLine()) != null) {								
			    String[] data = line.split(",");
			    this.dados.addAll(Arrays.asList(data));
			}			
		}
	}
	
	public void lerArquivoTXT(String caminho) throws Exception {
		try (FileReader reader = new FileReader(caminho); BufferedReader buffReader = new BufferedReader(reader)){
			String line = null;
			while ((line = buffReader.readLine()) != null) {	
				this.dados.add(line.substring(0, 11).trim());
				this.dados.add(line.substring(11, 30).trim());
				this.dados.add(line.substring(40, line.length() - 1).trim());
			}			
		}		
	}
}
