package exercicio1;

public class Cliente {
	
	private String nome;
	private int idade;
	private String genero;
	private String tipo;
	private String documento;
	
	
	public Cliente(String nome, int idade, String genero, String tipo, String documento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.tipo = tipo;
		this.documento = documento;
	}
	
	public String retornaNome() {
		String nomeCliente = nome;
		return nomeCliente;
	}
	public int retornaIdade() {
		int idadeCliente = idade;
		return idadeCliente;
	}
	public String retornaGenero() {
		String generoCliente = genero;
		return generoCliente;
	}
	public String retornaTipoCliente() {
		String tipoCliente = tipo;
		return tipoCliente;
	}
	public String retornaDocumento() {
		String tipoDocumento = documento;
		return tipoDocumento;
	}
	
	
	

}
