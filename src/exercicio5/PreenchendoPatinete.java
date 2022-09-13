package exercicio5;

public class PreenchendoPatinete {
	
	public static void main(String [] args) {
		
		Patinete patinete = new Patinete();
		
		patinete.setModelo("Patinete Elétrico");
		patinete.setMarca("Xiaomi");
		patinete.setCor("Preto");
		patinete.setFreio(true);
		
		System.out.println(patinete.getModelo());
		System.out.println(patinete.getMarca());
		System.out.println(patinete.getCor());
		System.out.println(patinete.isFreio());
	}

}
