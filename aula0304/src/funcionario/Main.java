package funcionario;

public class Main {
 
	public static void main(String[] args) {
		Motoboy motoboy = new Motoboy("Plínio", 15);
		Diretor diretor = new Diretor("Plínio", "MANSÃO");
		// Acesso ao sistema
		
		if (motoboy instanceof Autenticavel) {
			System.out.println("Acesso autorizado!");
			
		} else {
			System.out.println("Acesso negado!");
		}
		
		if (diretor instanceof Autenticavel) {
			System.out.println("Acesso Autorizado");
			
		} else {
			System.out.println("Acesso negado");
		}
	}
}

