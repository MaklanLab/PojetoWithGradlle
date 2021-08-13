package Praticando;

import java.util.Scanner;

public class Numero_maior {
    void numeros (int num1, int num2){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os numeros");
        num1 = leitor.nextInt();
        num2 = leitor.nextInt();
        if (num1>num2) System.out.println("O primeiro numero é maior");
        else if (num1==num2) System.out.println("Numeros iguais");
        else if (num2>num1) System.out.println("O segundo numero é maior");
    }

    public static void main(String[] args) {
        Numero_maior maior = new Numero_maior();
        maior.numeros(0,0);
    }
}
