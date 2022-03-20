package agendaClasses;

public class ContatoNaoExiste extends Exception {
	
	/*
	 * Essa classe � uma classe filha da classe Exception, onde usamos para
	   configurar a mensagem de erro quando a lista de contatos est� vazia,
	   definimos ela na classe Agenda, por�m tratamos no metodo main.
	*/
	@Override
	public String toString() {
		return "A lista de contatos est� vazia";
				}
	
}

