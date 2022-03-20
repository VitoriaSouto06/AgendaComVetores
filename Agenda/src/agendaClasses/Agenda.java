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
	 *Criei um vetor do tipo contato para armazenar os contatos e também tem uma varialvel que será o contador.
	*/
	
	ArrayList <Contato> contatos = new ArrayList();
	
	int i = 0;
	
	Scanner t = new Scanner(System.in);
	
	/*
	 * Metodo para adicionar um contato, para isso temos que passar um contato por parametro
	   que foi criado no main porém ainda não tem valores e temos o throws para ter um aviso que esse
	   metodo pode gerar uma exceção  
	*/
	
	public void adicionar(Contato c) throws AgendaCheia {
		/*
		 * Caso o id do proximo contato a ser criado seja maior que o vetor, ele vai jogar a exceção
		   que vai ser tratada no main, caso não gere exceção vamos adicionar o contato.
		*/
		
		if(contatos.size()>=10) {
			throw new AgendaCheia();
		}else {
		
		
		System.out.println("==== Adicionar Contato ====");
			contatos.add(i, c);
		i++;
		
		
				
	}}
	
	// Aqui é o metodo de consulta, no paramêtro também passamos uma variavel do tipo contato
	public void consultar() throws ContatoNaoExiste {
		
		/*
		 * Caso o vetor de contatos esteja vazio, ele vai lançar uma exceção
		   que é tratada no main, e vai dizer que a lista de contatos está vazia.
		*/
		if(contatos.isEmpty()==true) {
		
			throw new ContatoNaoExiste();
			
			
		}else {
			/*
			 * Caso tenha contatos nós vamos zerar o contador no for, e caso o array de contatos
			   na posição do contador seja diferente de nulo ele vai apresentar os valores.
			   E após aprensetar os valores ele incrementa
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
	 * Neste proximo metodo vamos buscar um contato especifico, caso ele não exista
	 * é lançada uma exceção, caso encontre, ele mostra os dados 
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
