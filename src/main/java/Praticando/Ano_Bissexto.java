package Praticando;

import java.util.Scanner;

public class Ano_Bissexto {
    Scanner scanner = new Scanner(System.in);
    void ano (int ano){
        ano = scanner.nextInt();
        double total = ano%4;
        if (total==0){
            System.out.println("Ano bissexto");
        }
        else System.out.println("Nao é bissexto");


    }

    public static void main(String[] args) {
        Ano_Bissexto calc = new Ano_Bissexto();
        calc.ano(0);
    }
}
