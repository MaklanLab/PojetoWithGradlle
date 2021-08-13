package Praticando;

import java.util.Scanner;

public class positivo_negativo {
    void seraSE (int b){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite os numeros");
        b = leitor.nextInt();
        if (b>0) System.out.println("positivo");
        else System.out.println("Negativo");
    }

    public static void main(String[] args) {
        positivo_negativo se = new positivo_negativo();
        se.seraSE(0);
    }
}
