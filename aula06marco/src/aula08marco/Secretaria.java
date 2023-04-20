package aula08marco;

public class Secretaria extends Funcionario{
	

	public String toString() {
		return "Secretaria \nID: " + super.id + 
				"\nNome: " + super.nome + 
				"\nIdade: " + super.idade + 
				"\nGenero: " + super.genero + 
				"\nSetor: " + Setor.SECRETARIA + "\n";
	}
	
	public Secretaria() {
		
	}
	
	public Secretaria (int id, String nome, int idade, Genero genero) {
		super (id, nome, idade, genero, Setor.SECRETARIA);
	}


	
}
