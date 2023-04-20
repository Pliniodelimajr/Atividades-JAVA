package interfaces;

public class TiroAoAlvoOnline implements Jogo{

    public void jogar() {
        System.out.println("Iniciando o jogo.");
        System.out.println("Carregando Servidor...");
        System.out.println("Preparando Partida...");
        System.out.println("Acerte o alvo.");
    }

    public void fechar() {
        System.out.println("Fechando partida...");
        System.out.println("Fechando conexão com servidor...");
    }
    
}