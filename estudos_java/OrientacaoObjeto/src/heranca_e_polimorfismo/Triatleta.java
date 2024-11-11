package heranca_e_polimorfismo;

public class Triatleta implements Corredor, Nadador, Ciclista{
    @Override
    public void Correr() {
        System.out.println("está correndo!");
    }
    @Override
    //@Override
    public void Nadar() {
        System.out.println("está nadando!");
    }

    //@Override
    public void Pedalar() {
        System.out.println("está pedalando!");
    }
    public static void main(String[] args){
//        System.out.println("Hello world!");
//        Carro carro1 = new Carro(0,true,0);
//        carro1.acelerar();
//        carro1.acelerar();
        Triatleta triatleta1 = new Triatleta();
        triatleta1.Correr();
        triatleta1.Nadar();
        triatleta1.Pedalar();
    }
}
