package agendaClasses;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class Agenda {
	
	/*
	 * Essa classe foi criada para ter a funcionalidade de adicionar, 
	   e visualizar contatos
	*/
	
	
	/*
	 *Criei um vetor do tipo contato para armazenar os contatos e tamb�m tem uma varialvel que ser� o contador.
	*/
	
	ArrayList <Contato> contatos = new ArrayList();
	
	int i = 0;
	
	Scanner t = new Scanner(System.in);
	
	/*
	 * Metodo para adicionar um contato, para isso temos que passar um contato por parametro
	   que foi criado no main por�m ainda n�o tem valores e temos o throws para ter um aviso que esse
	   metodo pode gerar uma exce��o  
	*/
	
	public void adicionar(Contato c) throws AgendaCheia {
		/*
		 * Caso o id do proximo contato a ser criado seja maior que o vetor, ele vai jogar a exce��o
		   que vai ser tratada no main, caso n�o gere exce��o vamos adicionar o contato.
		*/
		
		if(contatos.size()>=10) {
			throw new AgendaCheia();
		}else {
		
		
		System.out.println("==== Adicionar Contato ====");
			contatos.add(i, c);
		i++;
		
		
				
	}}
	
	// Aqui � o metodo de consulta, no param�tro tamb�m passamos uma variavel do tipo contato
	public void consultar() throws ContatoNaoExiste {
		
		/*
		 * Caso o vetor de contatos esteja vazio, ele vai lan�ar uma exce��o
		   que � tratada no main, e vai dizer que a lista de contatos est� vazia.
		*/
		if(contatos.isEmpty()==true) {
		
			throw new ContatoNaoExiste();
			
			
		}else {
			/*
			 * Caso tenha contatos n�s vamos zerar o contador no for, e caso o array de contatos
			   na posi��o do contador seja diferente de nulo ele vai apresentar os valores.
			   E ap�s aprensetar os valores ele incrementa
			*/
			int n = contatos.size();
			for(int cont=0;cont<n;cont++) {
				System.out.println(" === Consultas === ");
				System.out.print("Identificador: ");
				//Aqui mostramos o identificador
				System.out.println(contatos.get(cont).getIdentificador());
				System.out.print("Nome: ");
				//Aqui mostramos o nome
				System.out.println(contatos.get(cont).getNome());
				System.out.print("Telefone: ");
				//Aqui mostramos o telefone
				System.out.println(contatos.get(cont).getTelefone());
				System.out.println();
			}
		}	
	}
	
	
	
	/*
	 * Neste proximo metodo vamos buscar um contato especifico, caso ele n�o exista
	 * � lan�ada uma exce��o, caso encontre, ele mostra os dados 
	*/
	public void consultaEspecifica(int num) throws ContatoNaoLocalizado{
		if(contatos.isEmpty()) {
			throw new ContatoNaoLocalizado();
		}else {
		
		
		System.out.println("========== Consulta do contato "+num+" ==========");
		contatos.get(num-1);
		System.out.print("Identificador: ");
		System.out.println(contatos.get(num-1).getIdentificador());
		System.out.print("Nome: ");
		System.out.println(contatos.get(num-1).getNome());
		System.out.print("Telefone: ");
		System.out.println(contatos.get(num-1).getTelefone());
		System.out.println();
	
		}
		}
	
	
}	
