package mordhorst.anderson.isp;

public class BD {
	
	private Object conexao;
	
	protected void conectar() {
		this.conexao = null;
	}
	
	public Object getConexao() {
		return conexao;
	}
}
