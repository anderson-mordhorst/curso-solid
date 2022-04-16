package mordhorst.anderson.isp.interfaces;

import mordhorst.anderson.isp.componentes.Log;
import mordhorst.anderson.isp.componentes.Notificacao;

/*
 * Nesse projeto essa interface fere o princípio do ISP.
 * As classes que implementam essa interface devem implementar TODOS os métodos, mesmo que não precisem
 * É melhor existir muitas interfaces com seu objetivo específico do que uma interface genérica que abrange tudo.
 * */
public interface ICadastroSemIsp {	
	public void salvar();
	public void registrarLog(Log l);
	public void enviarNotificacao(Notificacao n);
}
