package Laço_de_repetiçao;

import java.util.Scanner;

public class Enquanto {
    void nota (float n1){
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();
        while (n1<0||n1>10){
            System.out.println("numero invalido");
            n1 = sc.nextFloat();
        }

    }

    public static void main(String[] args) {
        Enquanto vaiser = new Enquanto();
        vaiser.nota(0);
    }
}
