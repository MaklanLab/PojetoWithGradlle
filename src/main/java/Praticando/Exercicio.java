package Praticando;

import java.util.Scanner;

public class Exercicio {
    void soma (int a, int b, double c){
        System.out.println("A: "+((a*2)+(b/2)));
        System.out.println("B: "+(Math.pow(a,2)+c));
        System.out.println("C: "+ Math.pow(c,3));

    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Exercicio calc = new Exercicio();
        calc.soma(3,6,2);
        }
    }
