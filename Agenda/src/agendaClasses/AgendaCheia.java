package agendaClasses;

public class AgendaCheia extends Exception{

	
	/*
	 * Essa classe � uma classe filha da classe Exception, onde usamos para
	   configurar a mensagem de erro quando a agenda est� cheia,definimos ela
	   na classe Agenda, por�m tratamos no metodo main.
	*/
	
	@Override
	public String toString() {
		return "A agenda est� cheia";
				}
	
}

