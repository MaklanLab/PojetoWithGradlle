package Praticando;

import java.util.Scanner;

public class Triangulo {
    void triangulo (float l1, float l2, float l3){
        Scanner scanner = new Scanner(System.in);
        l1 = scanner.nextFloat();
        l2 = scanner.nextFloat();
        l3 = scanner.nextFloat();
        if (l1+l2>l3|| l1+l3>l2||l3+l2>l1) {
            System.out.println("É um triangulo");
        }
        else System.out.println("Nao é um triangulo");
            if (l1==l2&&l2==l3 && l1==l3){
                System.out.println("Equilatero");
        }
            else if(l1==l2&&l2==l3&&l1==l3||l1!=l3||l2!=l1){
                System.out.println("Isosceles");
            }
            else if (l1!=l2&&l1!=l3&&l2!=l3){
                System.out.println("Escaleno");
            }
    }

    public static void main(String[] args) {
        Triangulo calc = new Triangulo();
        calc.triangulo(0,0,0);
    }
}
