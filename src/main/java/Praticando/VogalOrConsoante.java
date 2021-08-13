package Praticando;

import java.util.Locale;
import java.util.Scanner;

public class VogalOrConsoante {
    void consoante (String a){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma letra");
       a = leitor.nextLine().toLowerCase(Locale.ROOT);
        if (a.equals("a") ||a.equals("e") ||a.equals("i")||a.equals("o")||a.equals("u") ){
            System.out.println("CONSOANTE!!");
        }
        else System.out.println( "VOGAL!!" );

    }

    public static void main(String[] args) {
        VogalOrConsoante definir = new VogalOrConsoante();
        definir.consoante(null);
    }
}
