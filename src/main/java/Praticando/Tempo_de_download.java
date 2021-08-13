package Praticando;

import java.util.Scanner;

public class Tempo_de_download {
    void tempo (double mb, double mbps){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite quantos mb o arquivo possui");
        mb = leitor.nextDouble();
        System.out.println("Qual a velocidade do link?");
        mbps = leitor.nextDouble();
        double total = mb / (mbps/8);
        System.out.println("O tempo é de: "+ total);

    }

    public static void main(String[] args) {
        Tempo_de_download chamando = new Tempo_de_download();
        chamando.tempo(0,0);
    }
}
