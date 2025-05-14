package Parte2_AplicandoMetodos;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Branca");

        lampada.mostrarEstado(); // Deve mostrar DESLIGADA
        lampada.ligar();
        lampada.mostrarEstado(); // Deve mostrar LIGADA
        lampada.desligar();
        lampada.mostrarEstado(); // Deve mostrar DESLIGADA novamente
    }
}
