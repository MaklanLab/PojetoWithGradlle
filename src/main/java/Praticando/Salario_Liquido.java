package Praticando;

import java.util.Scanner;

public class Salario_Liquido {
    void salario (double rs) {
        Scanner sc = new Scanner(System.in);
        rs = sc.nextDouble();
        double inss = (rs * 8) / 100;
        double imposto = (rs * 11) / 100;
        double sindicato = (rs * 5) / 100;
        double liquido = rs - inss - imposto - sindicato;
        System.out.println("voce pagou R$" + inss + " ao inss");
        System.out.println("voce pagou R$" + imposto + " ao imposto de renda");
        System.out.println("voce padou R$" + sindicato + " ao sindicato");
        System.out.println("---- SEU SALARIO LIQUIDO É DE R$ " + liquido + " ----");
    }

    public static void main(String[] args) {
        Salario_Liquido sl = new Salario_Liquido();
        sl.salario(0);
    }
}
