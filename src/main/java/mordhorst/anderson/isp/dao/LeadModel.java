package mordhorst.anderson.isp.dao;

import mordhorst.anderson.isp.BD;
import mordhorst.anderson.isp.componentes.Notificacao;
import mordhorst.anderson.isp.interfaces.ICadastro;
import mordhorst.anderson.isp.interfaces.INotificacao;

public class LeadModel extends BD implements ICadastro, INotificacao {

	@Override
	public void salvar() {		
	}

	@Override
	public void enviarNotificacao(Notificacao n) {
	
	}
}
