package exercicio4;

public class Funcionario {

	private String nome;
	private int idade;
	private float salario;
	private String funcao;
	private String documento;
	
	public Funcionario(String nome, int idade, float salario, String funcao, String documento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.funcao = funcao;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
	
	
}
