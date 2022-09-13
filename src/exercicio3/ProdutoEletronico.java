package exercicio3;

public class ProdutoEletronico {
	
	/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console.*/
	private String produto;
	private String modelo;
	private String marca;
	private int ano;
	private String cor;
	private String tipo;
	private int voltagem;
	
	public ProdutoEletronico(String produto, String modelo, String marca, int ano, String cor, String tipo,
		int voltagem) {
		super();
		this.produto = produto;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.tipo = tipo;
		this.voltagem = voltagem;
	}
	
	public String retornaProduto() {
		String produtoEletronico = produto;
		return produtoEletronico;
	}
	public String retornaModelo() {
		String modeloEletronico = modelo;
		return modeloEletronico;
	}
	public String retornaMarca() {
		String marcaEletronico = marca;
		return marcaEletronico;
	}
	public int retornaAno() {
		int anoEletronico = ano;
		return anoEletronico;
	}
	public String retornaCor() {
		String corEletronico = cor;
		return corEletronico;
	}
	public String retornaTipo() {
		String tipoEletronico = tipo;
		return tipoEletronico;
	}
	public int retornaVoltagem() {
		int voltagemEletronico = voltagem;
		return voltagemEletronico;
	}
	
	

}
