package mordhorst.anderson.dip.v2;

public class Mensageiro {
	
	private IMensagem canal;
	
	public Mensageiro(IMensagem canal) {
		this.canal = canal;
	}
	
	public void enviarToken() {
		canal.enviar();
	}
	
	public IMensagem getCanal() {
		return canal;
	}
}
