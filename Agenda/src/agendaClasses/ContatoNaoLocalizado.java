package agendaClasses;

public class ContatoNaoLocalizado extends Exception {

	/*
	 * Essa classe � uma classe filha da classe Exception, onde usamos para
	   configurar a mensagem de erro quando o contato n�o existe, definimos
	   ela na classe Agenda, por�m tratamos no metodo main.
	*/
	@Override
	public String toString() {
		return "Essa indenfica��o � inv�lida, este contato n�o existe";
	}

	
	
	
}

