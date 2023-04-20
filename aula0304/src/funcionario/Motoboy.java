package funcionario;

public class Motoboy extends Funcionario {

	private double comissao;


	public Motoboy(String nome, double comissao) {
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
