package agendaClasses;

public class Contato {

	/*
	 * Essa classe é um modelo para criamos um contato, onde vamos ter nome,
	   telefone e identificador que é gerado pelo contador.
	*/
	
	private String nome = null;
	private String telefone = null;
	private int identificador = 0;
	
	
	public int getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(int valor) {
		this.identificador = valor;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
	

