package mordhorst.anderson.isp.dao;

import mordhorst.anderson.isp.BD;
import mordhorst.anderson.isp.componentes.Log;
import mordhorst.anderson.isp.componentes.Notificacao;
import mordhorst.anderson.isp.interfaces.ICadastro;
import mordhorst.anderson.isp.interfaces.ILog;
import mordhorst.anderson.isp.interfaces.INotificacao;

public class UsuarioModel extends BD implements ICadastro, INotificacao, ILog {

	@Override
	public void salvar() {	
	}

	@Override
	public void registrarLog(Log l) {	
	}

	@Override
	public void enviarNotificacao(Notificacao n) {	
	}
}
