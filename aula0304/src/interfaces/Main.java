package interfaces;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		Pato pato = new Pato();
		Galo galo = new Galo();
		
		
		System.out.println(galo.emitirsom());
		System.out.println(galo.comer());
		System.out.println(pato.emitirsom());
		System.out.println(pato.comer());
		System.out.println(cachorro.emitirsom());
		System.out.println(cachorro.comer());
		System.out.println(gato.emitirsom());
		System.out.println(gato.comer());
	}
}
