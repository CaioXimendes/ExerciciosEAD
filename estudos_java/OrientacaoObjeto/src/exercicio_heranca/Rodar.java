package exercicio_heranca;

public class Rodar {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("12345", 1000);
        conta1.imprimirSaldo();
        conta1.depositar(100);
        conta1.imprimirSaldo();

        ContaPoupanca conta2 = new ContaPoupanca("23123", 5000);
        conta2.imprimirSaldo();
        conta2.depositar(100);
        conta2.imprimirSaldo();
        conta2.aplicarJurosMensais(1000,5);
        conta2.imprimirSaldo();
    }
}
