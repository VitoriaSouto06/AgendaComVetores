package agendaClasses;

public class AgendaCheia extends Exception{

	
	/*
	 * Essa classe é uma classe filha da classe Exception, onde usamos para
	   configurar a mensagem de erro quando a agenda está cheia,definimos ela
	   na classe Agenda, porém tratamos no metodo main.
	*/
	
	@Override
	public String toString() {
		return "A agenda está cheia";
				}
	
}

