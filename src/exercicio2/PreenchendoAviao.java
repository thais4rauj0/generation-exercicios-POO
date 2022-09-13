package exercicio2;

public class PreenchendoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao aviao = new Aviao ("Modelo 80","Boeing", 1920, "Comercial", 18);
		
		System.out.println(aviao.retornaModelo());
		System.out.println(aviao.retornaMarca());
		System.out.println(aviao.retornaAno());
		System.out.println(aviao.retornaTipo());
		System.out.println(aviao.retornaLugares());
	}

}
