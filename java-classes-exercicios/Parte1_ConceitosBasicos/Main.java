package Parte1_ConceitosBasicos;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);

        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
