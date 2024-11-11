import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        System.out.println(lista1.getTamanho());
        lista1.adicionar("PE");
        lista1.adicionar("SP");
        lista1.adicionar("RJ");

        for (int i= 0; i< lista1.getTamanho(); i++){
            System.out.println(lista1.get(i).getValor());
        }

        lista1.remover("RJ");
        lista1.remover("SP");
        lista1.remover("PE");

        for (int i= 0; i< lista1.getTamanho(); i++){
            System.out.println(lista1.get(i).getValor());
        }
        System.out.println(lista1.getTamanho());
    }
}