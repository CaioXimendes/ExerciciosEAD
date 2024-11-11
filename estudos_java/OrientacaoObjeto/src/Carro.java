public class Carro {
    private double velocidade;
    private boolean ligado;
    private double combustivel;

    public Carro(double velocidade, boolean ligado, double combustivel){
        this.velocidade = velocidade;
        this.ligado = ligado;
        this.combustivel = combustivel;
    }
    public void ligar(){
        System.out.println("Carro ligdo!");
    }
    public void acelerar(){
        this.velocidade = this.velocidade + 10;
        System.out.println("O Carro acelerou 10km/h e agora tem "+this.velocidade+"Km/h");
    }
}
