package mordhorst.anderson.isp.interfaces;

import mordhorst.anderson.isp.componentes.Log;
import mordhorst.anderson.isp.componentes.Notificacao;

/*
 * Nesse projeto essa interface fere o princ�pio do ISP.
 * As classes que implementam essa interface devem implementar TODOS os m�todos, mesmo que n�o precisem
 * � melhor existir muitas interfaces com seu objetivo espec�fico do que uma interface gen�rica que abrange tudo.
 * */
public interface ICadastroSemIsp {	
	public void salvar();
	public void registrarLog(Log l);
	public void enviarNotificacao(Notificacao n);
}
