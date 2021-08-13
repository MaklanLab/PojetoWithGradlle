package Praticando;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius");
        int f = leitor.nextInt();
        int c = (f * 9/5) + 32;
        System.out.println(c+"°C");
    }
}
