package Praticando;

import java.util.Scanner;

public class media {
    void mediaNota (double n1, double n2){
        System.out.println("digite uma nota: ");
        Scanner leitor = new Scanner(System.in);
        n1 = leitor.nextDouble();
        System.out.println("digite a segunda nota: ");
        n2 = leitor.nextDouble();
        double media = (n1+n2)/2;
        if(media>=7&&media<9.9){
            System.out.println("passou");}
        else if (media == 10){
            System.out.println("Parabens tirou 10");
        }
        else if (media <7){
            System.out.println("Reprovado");
        }

    }
    public static void main(String[] args) {
        media calc = new media();
        calc.mediaNota(0,0);





    }
}
