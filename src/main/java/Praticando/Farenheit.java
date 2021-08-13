package Praticando;

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em farenheit");
        int f = leitor.nextInt();
        double C = (f-32)*5/9;
        System.out.println(C);
    }
}
