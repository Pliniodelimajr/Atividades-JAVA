package aula08marco;

public abstract class Funcionario {
	protected int id;
	protected String nome;
	protected int idade;
	protected Genero genero;
	protected Setor setor;
	
	public Funcionario(int id, String nome, int idade, Genero genero, Setor setor) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.setor = setor;
	}

	public Funcionario () {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	
	
}