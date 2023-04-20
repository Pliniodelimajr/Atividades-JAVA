package aula08marco;

public class ProfDireito extends Funcionario{

	private String oab;
	

	public String toString() {
		return "Professor de Nutrição \nNome: " + super.nome + 
				"\nID: " + super.id + 
				"\nIdade: " + super.idade + 
				"\nGenero: " + super.genero + 
				"\nSetor: " + Setor.ACADEMICO + 
				"\nCRN: " + this.oab + "\n";
	}
	
	public ProfDireito() {
		
	}
	
	public ProfDireito (int id, String nome, int idade, Genero genero, String oab) {
		super (id, nome, idade, genero, Setor.ACADEMICO);
	}

	public String getOab() {
		return oab;
	}

	public void setOab(String oab) {
		this.oab = oab;
	}


	
}
