package Parte4_DesafioPratico;

public class Jogador {
    String nome;
    int vida;
    int forca;

    public Jogador(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Jogador outroJogador) {
        System.out.println(nome + " atacou " + outroJogador.nome + " causando " + forca + " de dano!");
        outroJogador.vida -= forca;

        if (outroJogador.vida < 0) {
            outroJogador.vida = 0;
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("-------------------------");
    }
}
