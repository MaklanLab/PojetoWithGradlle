package Praticando;

import java.util.Locale;
import java.util.Scanner;

public class Periodo {
    void turno(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println(" (m) para matutino \n (v) para vespertino \n (n) para noturno");
        a = sc.nextLine().toLowerCase(Locale.ROOT);
        switch (a){
            case "m":
                System.out.println("Bom dia");
                break;
            case "v":
                System.out.println("Boa tarde");
                break;
            case "n":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Periodo nao reconhecido");
        }
    }

    public static void main(String[] args) {
        Periodo sla = new Periodo();
        sla.turno(null);
    }
}
