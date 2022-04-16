package mordhorst.anderson.srp;

public class EmailService {
	
	private String de;
	private String para;
	private String conteudo;
	
	public EmailService() {
		this.de = "contato@teste.com";
		this.para = "";
		this.conteudo = "";		
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public String getDe() {
		return de;
	}
	
	public String getPara() {
		return para;
	}
	
	public static String enviaEmail() {
		return "Email enviado";
	}
}
