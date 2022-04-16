package mordhorst.anderson.ocp;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Anderson Mordhorst
 *
 */

public class Txt extends Arquivo {

	@Override
	public void lerArquivo(String caminho) throws Exception {
		try (FileReader reader = new FileReader(caminho); BufferedReader buffReader = new BufferedReader(reader)){
			String line = null;
			while ((line = buffReader.readLine()) != null) {
				addLine(line.substring(0, 11).trim());
				addLine(line.substring(11, 30).trim());
				addLine(line.substring(40, line.length() - 1).trim());
			}			
		}		
	}
}
