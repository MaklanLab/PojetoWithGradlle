package Praticando;

import java.util.Scanner;

public class folha_de_pagamento {
    void salario (double hora,int mes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quanto voce ganha por hora");
        hora = scanner.nextDouble();
        System.out.println("Digite quantas horas voce trabalha em um mes");
        mes = scanner.nextInt();
        var totalSalario = Math.floor(hora*mes);
        System.out.println("salario bruto: "+"("+hora+" × "+mes+")"+"         : R$ "+totalSalario);
        if (totalSalario<=900){
            var inss = totalSalario*10/100;
            var fgts = totalSalario*11/100;
            var desconto = 0+ inss;
            var salario1 = totalSalario - desconto;
            System.out.println("(-) IR (0%)"+"                       : R$ 0,00");
            System.out.println("(-)INSS(10%)"+"                      : R$ "+inss);
            System.out.println("(-) FGTS (11%)"+"                    : R$ "+fgts);
            System.out.println("Total de desconto"+"                 : R$ "+desconto);
            System.out.println("Salario liquido                      : R$ "+salario1);
        }
        else if (totalSalario >900 && totalSalario<=1500){
            var inss = totalSalario*10/100;
            var ir = totalSalario*5/100;
            var fgts = totalSalario*11/100;
            var desconto = ir + inss;
            var salario1 = totalSalario - desconto;
            System.out.println("(-) IR (5%)"+"                        : R$ "+ir);
            System.out.println("(-) INSS (10%)"+"                     : R$ "+inss);
            System.out.println("(-) FGTS (11%)"+"                     : R$ "+fgts);
            System.out.println("Total de desconto"+"                  : R$ "+desconto);
            System.out.println("Salario liquido                    : R$ "+salario1);

        }
        else if (totalSalario>1500 && totalSalario<=2500){
            var inss = totalSalario*10/100;
            var ir = totalSalario*10/100;
            var fgts = totalSalario*11/100;
            var desconto = ir + inss;
            var salario1 = totalSalario - desconto;
            System.out.println("(-) IR (10%)"+"                       : R$ "+ir);
            System.out.println("(-) INSS (10%)"+"                     : R$ "+inss);
            System.out.println("(-) FGTS (11%)"+"                     : R$ "+fgts);
            System.out.println("Total de desconto"+"                  : R$ "+desconto);
            System.out.println("Salario liquido                       : R$ "+salario1);
        }
        else if (totalSalario>2500){
            var inss = totalSalario*10/100;
            var ir = totalSalario*15/100;
            var fgts = totalSalario*11/100;
            var desconto = ir + inss;
            var salario1 = totalSalario - desconto;
            System.out.println("(-) IR (15%)"+"                       : R$ "+ir);
            System.out.println("(-) INSS (10%)"+"                     : R$ "+inss);
            System.out.println("(-) FGTS (11%)"+"                     : R$ "+fgts);
            System.out.println("Total de desconto"+"                  : R$ "+desconto);
            System.out.println("Salario liquido                       : R$ "+salario1);
        }


    }

    public static void main(String[] args) {
        folha_de_pagamento liquido = new folha_de_pagamento();
        liquido.salario(0,0);

    }
}
