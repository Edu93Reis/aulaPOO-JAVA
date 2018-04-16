package T34;

public class Usuario {
	protected String login;
	
	protected Usuario(String login) {
		this.login = login;
	}
	
	protected void boasVindas() {
		System.out.println("Bem-vindo " + login);
	}
}
/*
 
 (Obrigat�rio) Em Desenvolvimento Web, autentica��o
  e autoriza��o s�o conceitos fundamentais. Em um sistema, um Guest,
 Regular, Group e Root s�o tipos de Usu�rio. Um usu�rio possui uma
 string que representa seu login. Cada um desses vai possuir m�todos de
 despedida e descri��o da permiss�o (o que cada um deles fazem. Aqui
 voc� � livre para criar). Os m�todos descritos devem possuir a conven��o acaoUsuario 
 (por exemplo, despedidaRegular()). Um regular
 ter� um m�todo chamado void dashboard() (imita��o de uma �rea de
 usu�rio cadastrado), o usu�rio de grupo ter� um void groupBoard()
 que avisar� que ele poder� apagar usu�rios de seu grupo (apenas a
 mensagem). O super usu�rio ter� um m�todo void excluirTodos()
 que avisa que ele poder� excluir todos os usu�rios (apenas mensagem).
 Sabe-se que todos esses usu�rios mostrar�o uma mensagem de boasvindas ao �nicio do sistema. 
 A mensagem ser�: Bem-vindo <seuloginaqui>.
 Implemente as classes envolvidas e esboce um diagrama de classes. Crie
 um menu de testes a partir da descri��o do problema acima.
 
 */
