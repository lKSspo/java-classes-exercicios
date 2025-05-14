package Parte2_AplicandoMetodos;

public class Lampada {
    String cor;
    boolean ligada;

    public Lampada(String cor) {
        this.cor = cor;
        this.ligada = false; // A lâmpada começa desligada
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada " + cor + " está LIGADA.");
        } else {
            System.out.println("A lâmpada " + cor + " está DESLIGADA.");
        }
    }
}
