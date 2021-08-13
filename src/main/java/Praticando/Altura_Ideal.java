package Praticando;

import java.util.Scanner;

public class Altura_Ideal {


   public void altura (double al) {
       Scanner sc = new Scanner(System.in);
        al = sc.nextDouble();
        double all = (72.7*al) - 58;
       System.out.println("Seu peso ideal é: " + all);

    }

    public static void main(String[] args) {
        Altura_Ideal sla = new Altura_Ideal();
        sla.altura(0);


    }
}
