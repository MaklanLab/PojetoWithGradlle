package Praticando;

import java.util.Scanner;

public class Ano_Segundos {
    double ano(int tempo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade dias que voce quer saber a quantidade de segundos");
        tempo = scanner.nextInt();
        var sg = 60;
        var horas = 60;
        var dias = (horas*sg)*24;

        var total = dias * tempo;

        System.out.println(total);
        return dias+horas;



    }


    public static void main(String[] args) {
        Ano_Segundos calc = new Ano_Segundos();
        calc.ano(2);


    }
}
