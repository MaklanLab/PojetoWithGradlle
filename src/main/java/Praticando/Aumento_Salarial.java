package Praticando;

import java.util.Scanner;

public class Aumento_Salarial {
    void salario (double a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario");
        a = scanner.nextDouble();

        if (a<=280) {
            var total = (a*20)/100;
            System.out.println("Seu salario é de R$"+a);
            System.out.println("Aumento de 20%");
            System.out.println("foi adcionado R$"+total);
            System.out.println("O salario agora é R$"+(total+a));
        }
        else if (a>280&&a<700){
            var total = (a*15)/100;
            System.out.println("Seu salario é de R$"+a);
            System.out.println("Teve um aumento de 15%");
            System.out.println("foi adcionado R$"+total);
            System.out.println("Seu salario agora é R$"+(total+a));
        }
        else if (a>700&&a<1500){
            var total = (a*10)/100;
            System.out.println("Seu salario é de R$"+a);
            System.out.println("Teve um aumento de 10%");
            System.out.println("foi adcionado R$"+total);
            System.out.println("seu salario agora é R$"+(total+a));
        }
        else if(a>1500) {
            var total = (a*5)/100;
            System.out.println("Seu salario é de R$"+a);
            System.out.println("Teve um aumento de 5%");
            System.out.println("foi adcionado R$"+total);
            System.out.println("Seu salario agora é R$"+(total+a));
        }

    }

    public static void main(String[] args) {
        Aumento_Salarial sla = new Aumento_Salarial();
        sla.salario(0);
    }
}
