package mordhorst.anderson.ocp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @author Anderson Mordhorst
 *
 */

public class Csv extends Arquivo {

	@Override
	public void lerArquivo(String caminho) throws Exception {
		try (FileReader reader = new FileReader(caminho); BufferedReader buffReader = new BufferedReader(reader)){
			String line = null;
			while ((line = buffReader.readLine()) != null) {								
			    String[] data = line.split(",");
			    Arrays.asList(data).forEach(this::addLine);
			}			
		}		
	}
}
