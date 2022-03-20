package agendaClasses;

public class ContatoNaoExiste extends Exception {
	
	/*
	 * Essa classe é uma classe filha da classe Exception, onde usamos para
	   configurar a mensagem de erro quando a lista de contatos está vazia,
	   definimos ela na classe Agenda, porém tratamos no metodo main.
	*/
	@Override
	public String toString() {
		return "A lista de contatos está vazia";
				}
	
}

