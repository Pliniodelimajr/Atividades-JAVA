package aula08marco;

public class ProfNutricionista extends Funcionario{

	private String crn;
	

	public String toString() {
		return "Professor de Nutrição \nNome: " + super.nome + 
				"\nID: " + super.id + 
				"\nIdade: " + super.idade + 
				"\nGenero: " + super.genero + 
				"\nSetor: " + Setor.ACADEMICO + 
				"\nCRN: " + this.crn + "\n";
	}
	
	public ProfNutricionista() {
		
	}
	
	public ProfNutricionista (int id, String nome, int idade, Genero genero, String crn) {
		super (id, nome, idade, genero, Setor.ACADEMICO);
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}


	
}
