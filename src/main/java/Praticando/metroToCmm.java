package Praticando;

import java.util.Scanner;

public class metroToCmm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("_-_-_ Digite quantos metros voce quer converter para centimetros-_-_-");
        double cmm = leitor.nextDouble();
        double ToMeters = cmm*100;
        System.out.println("****"+ToMeters+"****");
    }
}
