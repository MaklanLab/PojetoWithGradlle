package Praticando;

import java.util.Scanner;

public class quadrado_area
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Digite o Lado do quadrado");
        double lado = leitor.nextDouble();
        double area = Math.pow(lado,2);
        double dobro = area * area;
        System.out.println("A area do quadrado é: "+area+"e o dobro é: "+ dobro);

    }
}
