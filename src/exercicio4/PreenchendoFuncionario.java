package exercicio4;

public class PreenchendoFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Funcionario ("Thais", 21, 3500f, "Dev FullStack Java","222-333-444-555");
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getIdade());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getFuncao());
		System.out.println(funcionario.getDocumento());
	}

}
