package exercicio_heranca;

public class ContaPoupanca {
    private String numero;
    private double saldo = 1000;

    public ContaPoupanca(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void imprimirSaldo(){
        System.out.println("Saldo da conta de ciclano é: "+this.saldo);
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
    public double aplicarJurosMensais(double valor, int meses){
        this.saldo = this.saldo + valor*(1+0.005*meses);
        return saldo;
    }
}
