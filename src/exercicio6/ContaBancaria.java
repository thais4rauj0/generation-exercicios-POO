package exercicio6;

public class ContaBancaria {
	private float valor;
	private float saldo = 100;
	private int contaOrigem;
	private int contaDestino;
	private int numConta;
	private String nome;
	
	public ContaBancaria(float valor, float saldo, int contaOrigem, int contaDestino, int numConta, String nome) {
		super();
		this.valor = valor;
		this.saldo = saldo;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.numConta = numConta;
		this.nome = nome;
	}

	public ContaBancaria() {
		super();
	}
	
	public float sacarDinheiro() {
		float saque = saldo - valor;
		return saque;
	}

	public float depositarDinheiro() {
		float deposito = saldo + valor;
		return deposito;
	}
	public float transferirDinheiro() {
		float transferencia = saldo - valor;
		return transferencia;
	}
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(int contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public float getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(int contaDestino) {
		this.contaDestino = contaDestino;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}