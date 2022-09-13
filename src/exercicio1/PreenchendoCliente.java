package exercicio1;

public class PreenchendoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente ("Thais", 21,"feminino", "físico", "54-817-56986");
		
		System.out.println(cliente.retornaNome());
		System.out.println(cliente.retornaIdade());
		System.out.println(cliente.retornaGenero());
		System.out.println(cliente.retornaTipoCliente());
		System.out.println(cliente.retornaDocumento());
	}

}
