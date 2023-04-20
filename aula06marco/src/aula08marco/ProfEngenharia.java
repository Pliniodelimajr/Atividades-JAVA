package aula08marco;

public class ProfEngenharia extends Funcionario {
	
private String crea;
	
	public String toString() {
		return "ProfEngenharia \nNome: " + super.nome + 
				"\nID: " + super.id + 
				"\nIdade: " + super.idade + 
				"\nGenero: " + super.genero + 
				"\nSetor: " + Setor.ACADEMICO + 
				"\nCREA: " + this.crea + "\n";
	}
	
	public ProfEngenharia() {
	
	}
	
	public ProfEngenharia (int id, String nome, int idade, Genero genero, String crea) {
		super (id, nome, idade, genero, Setor.ACADEMICO);
		this.crea = crea;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}
}

	



