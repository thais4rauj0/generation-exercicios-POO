package exercicio7;

public class Paciente {
	
	private String nome;
	private String genero;
	private int idade;
	private int telefone;
	private String email;
	private String documento;
	
	
	public Paciente(String nome, String genero, int idade, int telefone, String email, String documento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
		this.documento = documento;
	}

	public Paciente() {
		super();
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}
	

}
