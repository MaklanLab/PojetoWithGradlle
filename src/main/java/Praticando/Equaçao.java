package Praticando;

import java.util.Scanner;

public class Equaçao {
    void valor (float a,float b, float c){
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        if (a == 0){
            System.out.println("nao é uma equaçao de 2 grau");
        }
        b = sc.nextFloat();
        c = sc.nextFloat();
        var dealta = a + b + c;
        if (dealta<0){
            System.out.println("Nao possui raizes reais");
        }
        else if (dealta==0){
            System.out.println("Equaçao possui apenas uma raiz real");
        }
        else if (dealta >0 ){
            System.out.println("A equaçao possui duas raizes reais");
        }
    }

    public static void main(String[] args) {
        Equaçao calc = new Equaçao();
        calc.valor(0,0,0);
    }
}
