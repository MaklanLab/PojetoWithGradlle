package Praticando;

import java.util.Scanner;

public class Notas_Parciais {
    void nota(double n1, double n2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas: ");
        n1 = scanner.nextDouble();
        System.out.println("Agora digite a 2 nota");
        n2 = scanner.nextDouble();
        String conceito = "";
        var media = Math.floor(n1+n2)/2;
        if (media >= 9) {
            System.out.println("Media           conceito");
            conceito = "A";
            System.out.println(media+"              "+conceito);
        }
        else if (media>7.50 && media <9.0 ){
            System.out.println("Media           conceito");
            conceito = "B";
            System.out.println(media+"              "+conceito);
        }
        else if (media >6.0 && media <7.5){
            System.out.println("Media           conceito");
            conceito = "C";
            System.out.println(media+"              "+conceito);
        }
        else if (media >4.0 && media<6.0){
            System.out.println("Media           conceito");
            conceito = "D";
            System.out.println(media+"              "+conceito);
        }
        else if (media>= 0 && media<4.0){
            System.out.println("Media           conceito");
            conceito = "E";
            System.out.println(media+"              "+conceito);
        }
        switch (conceito) {
            case "A", "B", "C" -> System.out.println("Aprovado");
            case "D", "E" -> {
                System.out.println("Reprovado");
                System.out.println("Estude mais");
            }

        }
    }

    public static void main(String[] args) {
        Notas_Parciais calc = new Notas_Parciais();
        calc.nota(0,0);
    }
}
