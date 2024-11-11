package exercicio_heranca;

public class ContaCorrente {
    private String numero;
    private double saldo = 1000;

    public ContaCorrente(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void imprimirSaldo(){
        System.out.println("Saldo da conta de fulano é: "+this.saldo);
    }
    public double depositar(double valor){
        if (!(valor < 0)){
            this.saldo = this.saldo + valor;
        }
        else{
            System.out.println("Valor inválido!");
        }
        return saldo;
    }
}
