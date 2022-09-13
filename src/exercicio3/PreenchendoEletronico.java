package exercicio3;

public class PreenchendoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoEletronico produtoE = new ProdutoEletronico ("Smartphone", "M52","Samsung", 2021,"preto","dispositivo eletronico portátil", 0);
		
		System.out.println(produtoE.retornaProduto());
		System.out.println(produtoE.retornaModelo());
		System.out.println(produtoE.retornaMarca());
		System.out.println(produtoE.retornaAno());
		System.out.println(produtoE.retornaCor());
		System.out.println(produtoE.retornaTipo());
		System.out.println(produtoE.retornaVoltagem());
	}

}
