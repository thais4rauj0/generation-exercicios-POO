package exercicio5;

public class Patinete {
	
	private String modelo;
	private String marca;
	private String cor;
	private boolean freio;
	
	public Patinete(String modelo, String marca, String cor, boolean freio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.freio = freio;
	}

	public Patinete() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isFreio() {
		return freio;
	}

	public void setFreio(boolean freio) {
		this.freio = freio;
	}
	
}
