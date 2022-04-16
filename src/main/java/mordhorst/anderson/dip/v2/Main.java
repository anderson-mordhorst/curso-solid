package mordhorst.anderson.dip.v2;

public class Main {

	public static void main(String[] args) {
		Mensageiro m = new Mensageiro(new Sms());
		m.enviarToken();
		
		m = new Mensageiro(new Email());
		m.enviarToken();
	}
}
