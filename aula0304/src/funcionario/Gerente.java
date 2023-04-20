 package funcionario;

public class Gerente extends Funcionario implements Autenticavel{
	
	private double comissao;


	public Gerente(String nome, double comissao) {
		super(nome);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
