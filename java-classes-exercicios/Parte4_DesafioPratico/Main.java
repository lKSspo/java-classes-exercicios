package Parte4_DesafioPratico;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Arqueiro", 100, 30);
        Jogador jogador2 = new Jogador("Espadachim", 120, 20);

        System.out.println("Status inicial:");
        jogador1.mostrarStatus();
        jogador2.mostrarStatus();

        // Jogador1 ataca jogador2
        jogador1.atacar(jogador2);

        System.out.println("Status após o ataque:");
        jogador1.mostrarStatus();
        jogador2.mostrarStatus();
    }
}
