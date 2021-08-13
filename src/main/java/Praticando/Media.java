package Praticando;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor =new Scanner(System.in);
        System.out.println("****digite a primeira nota****");
        float nota1 = leitor.nextFloat();
        System.out.println("digite a segunda nota");
        float nota2 = leitor.nextFloat();
        System.out.println("digite a terceira nota");
        float nota3 = leitor.nextFloat();
        System.out.println("digite a quarta nota");
        float nota4 = leitor.nextFloat();
        System.out.println("------A media é de: "+(nota1+nota2+nota3+nota4)/4+"------");
    }
}
