package exercicio7;

public class PreenchendoPaciente {
	
	public static void main(String[]args) {
		
		Paciente paciente = new Paciente ();
		
		paciente.setNome("Thais");
		paciente.setIdade(21);
		paciente.setGenero("Feminino");
		paciente.setEmail("thais@email.com");
		paciente.setTelefone(123456789);
		paciente.setDocumento("123.456.789-01");
		
		System.out.println("\nNome: " + paciente.getNome());
		System.out.println("\nIdade: " + paciente.getIdade());
		System.out.println("\nGênero: " + paciente.getGenero());
		System.out.println("\nE-mail: " + paciente.getEmail());
		System.out.println("\nTelefone: " + paciente.getTelefone());
		System.out.println("\nDocumento: " + paciente.getDocumento());
		
		
	}
}
