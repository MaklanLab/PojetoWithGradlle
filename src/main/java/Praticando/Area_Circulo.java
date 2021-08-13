package Praticando;

import java.util.Scanner;

public class Area_Circulo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Digite o raio" );
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();
        double total = Math.pow(raio,2)*3.14;
        double diametro = 2*raio;
        double comprimento = 2*3.14*raio;
        System.out.println("*** Diametro de: "+diametro+" o comprimento é: "+comprimento+" e area de: "+total+" ***");
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
