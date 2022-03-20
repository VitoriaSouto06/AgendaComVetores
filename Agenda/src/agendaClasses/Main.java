package agendaClasses;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;

public class Main {

	public static void main(String[] args) {
		//Variavel int para compor o contador da agenda
		int i=1;

		//Variavel t para pegar dados digitados pelo usuário
		Scanner t = new Scanner(System.in);

		//Objeto do tipo Agenda 
		Agenda a = new Agenda();



		//Variavel para o contador while do menu
		int cont = 5;


		//Laço de repetição para rodar o while e mostrar o menu, enquanto for diferente de 0 ele irá rodar novamente
		while(cont !=0) {
			System.out.println("========== Menu ==========");
			System.out.println("1- Adicionar contato\n2- Consultar\n3- Consultar Contato Especifico\n0- Sair");

			// A variavel cont pega a opção que o usuário digitar 
			try {
				cont = t.nextInt();
			}catch(InputMismatchException ex) {
				System.out.println("Opção Inválida");
				cont=0;
			}

			//Se o usuario quiser a 1ºopção, ele irá adicionar uma pessoa na agenda
			if(cont==1) {

				//Criamos um contato do tipo Contato
				Contato c = new Contato();

				//Atribuimos nos metodos set o nome, telefone, e identificador
				System.out.print("Nome:");
				c.setNome(t.next());
				System.out.println("Telefone: ");
				c.setTelefone(t.next());
				c.setIdentificador(i);


				/* 
				 * Tratamento de exceção, esse try verifica se tem espaço na agenda para adicionar 
				   caso tenha espaço ele adiciona mais um, caso não ele retorna uma mensagem dizendo 
				   que a agenda está cheia.
				 */
				try {
					a.adicionar(c);
				}catch(AgendaCheia ex) {
					System.out.println(ex.toString());
				}
				//Variavel i vai ser incrementada para definir o identificador do proximo contato a ser adicionado
				i++;

				//Caso seja a opção 2 ele poderá consultar os contatos existentes
			}else if(cont==2) {

				/*
				 *Esse try tenta consultar os contatos, caso tenha contatos armazenados ele 
				  retorna os contatos, caso não tenha ele lança uma exceção e mostra uma mensagem
				  falando que a lista de contatos esta vazia.
				 */
				try {
					a.consultar();
				}catch(ContatoNaoExiste ex) {

					System.out.println(ex.toString());
				}

				//Nesta opção o usuario pode procurar um contato pelo identificador	
			}else if(cont==3){
				/*
				 *Esse try tenta consultar contatos especificos, caso tenha um contato com o id solicitado ele 
				  retorna o contato, caso não tenha ele lança uma exceção e mostra uma mensagem
				  falando que este contato não existe.
				 */

				//Atribui o identificador do contato
				int num;

				System.out.println("Digite o indetificador do contato desejado: ");
				num = t.nextInt();

				/*
				 * Neste try vamos tentar consultar um contato pelo identificador 
				   caso este contato não exista, ou o numero procurado seja maior 
				   do que o de contatos armazenados ele gera uma exceção e mostra que
				   este contato não existe na lista
				 */
				try {
					a.consultaEspecifica(num);
				}catch(ContatoNaoLocalizado ex) {
					System.out.println(ex.toString());
				}catch(IndexOutOfBoundsException ex) {
					System.out.println("Esse número não existe na lista");
				}


				//Nesta opção do if ele vai encerrar o programa 
			}else if(cont ==0) {

				System.exit(0);


				//Nesta opção caso o usuario digite outro número ele retorna uma mensagem falando que é invalido
			}else {
				System.out.println("Número Inválido");
			}


		}



	}

}

