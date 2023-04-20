package aula1004;

public class Main {
	public static void main(String[] args) {
		ImpressoraLocal impressora = new ImpressoraLocal();
			impressora.imprimir(new Epson());
	}
}
