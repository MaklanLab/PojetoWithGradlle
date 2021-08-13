package Praticando;

import java.util.Scanner;

public class SalararioPerHours {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora?");
        double hora = leitor.nextDouble();
        System.out.println("Quantas horas voce trabalha no mes?");
        double horaMes = leitor.nextDouble();
        double salario = hora * horaMes;
        System.out.println("Voce ganha: "+ salario);
    }

}
