package Praticando;

import java.util.Scanner;

public class MaiorEmenor {
    void numeros (int n1, int n2,int n3) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite os numeros a baixo");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        if (n1>n2&&n1>n3) System.out.println("Primeiro numero é maior");
        else if (n2>n1&&n2>n3) System.out.println("seundo numero é maior");
        else if (n3>n1&&n3>n2) System.out.println("terceiro numero é maior");

        if (n1<n2&&n1<n3) System.out.println("primeiro numero é o menor");
        else if (n2<n1&&n2<n3) System.out.println("segundo numero é o menor");
        else if ( n3<n2&&n3<n1) System.out.println("terceiro é o menor");
    }

    public static void main(String[] args) {
        MaiorEmenor sla = new MaiorEmenor();
        sla.numeros(0,0,0);
    }
}
