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
 
 (Obrigatório) Em Desenvolvimento Web, autenticação
  e autorização são conceitos fundamentais. Em um sistema, um Guest,
 Regular, Group e Root são tipos de Usuário. Um usuário possui uma
 string que representa seu login. Cada um desses vai possuir métodos de
 despedida e descrição da permissão (o que cada um deles fazem. Aqui
 você é livre para criar). Os métodos descritos devem possuir a convenção acaoUsuario 
 (por exemplo, despedidaRegular()). Um regular
 terá um método chamado void dashboard() (imitação de uma área de
 usuário cadastrado), o usuário de grupo terá um void groupBoard()
 que avisará que ele poderá apagar usuários de seu grupo (apenas a
 mensagem). O super usuário terá um método void excluirTodos()
 que avisa que ele poderá excluir todos os usuários (apenas mensagem).
 Sabe-se que todos esses usuários mostrarão uma mensagem de boasvindas ao ínicio do sistema. 
 A mensagem será: Bem-vindo <seuloginaqui>.
 Implemente as classes envolvidas e esboce um diagrama de classes. Crie
 um menu de testes a partir da descrição do problema acima.
 
 */
