package Parte3_LogicaComAtributos;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 500.0);

        conta.mostrarSaldo();

        conta.depositar(250.0);
        conta.mostrarSaldo();

        conta.sacar(100.0);
        conta.mostrarSaldo();

        conta.sacar(800.0); // Tentativa de saque maior que o saldo
        conta.mostrarSaldo();
    }
}
