package mordhorst.anderson.ocp;

import mordhorst.anderson.ocp.original.Leitor;

public class Main {

	public static void main(String[] args) throws Exception {
		Leitor l = new Leitor();		
		l.setDiretorio("D:\\Cursos\\worspace\\solid\\target\\classes");
		l.setArquivo("dados.csv");
		l.lerArquivo().forEach(System.out::println);
	}
}
