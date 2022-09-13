package exercicio2;

public class Aviao {
		private String modelo;
		private String marca;
		private int ano;
		private String tipo;
		private int lugares;
		
		public Aviao(String modelo, String marca, int ano, String tipo, int lugares) {
			super();
			this.modelo = modelo;
			this.marca = marca;
			this.ano = ano;
			this.tipo = tipo;
			this.lugares = lugares;
		}
		
		public String retornaModelo() {
			String modeloAviao = modelo;
			return modeloAviao;
		}
		
		public String retornaMarca() {
			String marcaAviao = marca;
			return marcaAviao;
		}
		
		public int retornaAno() {
			int anoAviao = ano;
			return anoAviao;
		}
		public String retornaTipo() {
			String tipoAviao = tipo;
			return tipoAviao;
		}
		public int retornaLugares() {
			int lugaresAviao = lugares;
			return lugaresAviao;
		}
		
}