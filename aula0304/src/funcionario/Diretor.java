package funcionario;

public class Diretor extends Funcionario implements Autenticavel{
	
	private String propriedade;

	public Diretor(String nome, String propriedade) {
		super(nome);
		this.propriedade = propriedade;
	}

	public String getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(String propriedade) {
		this.propriedade = propriedade;
	}
	
	

}
