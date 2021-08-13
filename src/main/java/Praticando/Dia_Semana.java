package Praticando;

import java.util.Scanner;

public class Dia_Semana {
    void dia (int quedia){
        System.out.println("digite um numero de 1 a 7");
        Scanner scanner =  new Scanner(System.in);
        quedia = scanner.nextInt();
        switch (quedia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero nao reconhecido");
        }
    }

    public static void main(String[] args) {
        Dia_Semana sla = new Dia_Semana();
        sla.dia(0);
    }
}
