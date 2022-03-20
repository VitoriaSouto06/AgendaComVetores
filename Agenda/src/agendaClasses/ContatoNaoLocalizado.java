package agendaClasses;

public class ContatoNaoLocalizado extends Exception {

	/*
	 * Essa classe é uma classe filha da classe Exception, onde usamos para
	   configurar a mensagem de erro quando o contato não existe, definimos
	   ela na classe Agenda, porém tratamos no metodo main.
	*/
	@Override
	public String toString() {
		return "Essa indenficação é inválida, este contato não existe";
	}

	
	
	
}

