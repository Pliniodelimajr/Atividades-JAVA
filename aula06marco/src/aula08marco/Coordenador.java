package aula08marco;

public class Coordenador extends Funcionario{


	public String toString() {
		return "Coordenador \nID: " + super.id + 
				"\nNome: " + super.nome + 
				"\nIdade: " + super.idade + 
				"\nGenero: " + super.genero + 
				"\nSetor: " + Setor.COORDENACAO + 
				"\n";
	}
	
	public Coordenador() {
	
	}
	
	public Coordenador (int id, String nome, int idade, Genero genero) {
		super (id, nome, idade, genero, Setor.COORDENACAO);
	}

	
}
