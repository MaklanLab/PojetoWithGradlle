package Laço_de_repetiçao;

import java.util.Objects;
import java.util.Scanner;

public class validacao {
    void valide (String nome, int idade, double salario,String sexo, String civil){
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome");
            nome = sc.nextLine();

        while (nome.length()<3){
            System.out.println("Nome invalido digite novamente");
            nome = sc.nextLine();
        }


boolean verdade;

       do {
           System.out.println("Digite seu sexo (f) para feminino, (m) para masculino e (i) para preferiro nao indentificar");
           sexo = sc.nextLine();
           if (sexo.equals("m")||sexo.equals("f")||sexo.equals("i")){
               verdade = true;
           }
           else {
               System.out.println("Digito errado");
               verdade = false;
           }


       } while (!verdade);

            do {
                System.out.println("Digite (s) para solteiro, (c) para casado, (d) divorciado e (v) para viuvo ");
                civil = sc.nextLine();
                if (civil.equals("c")|| civil.equals("d")|| civil.equals("v")|| civil.equals("s")){}
                else {
                    verdade = false;
                }
            }while (!verdade);

            System.out.println("Digite sua idade");
            idade = sc.nextInt();

                while(idade>150|| idade<0){
                 System.out.println("digite uma idade correta");
                    idade = sc.nextInt();
        }
                System.out.println("digite seu salario");
                     salario = sc.nextDouble();

                        while (salario<0){
                            System.out.println("Salario invalido");
                                salario = sc.nextDouble();
        }
        switch (sexo) {
            case "m" -> sexo = "Masculino";
            case "f" -> sexo = "Feminino";
            case "i" -> sexo = "Nao indentificado";
        }
                        if (sexo.equals("Feminino")) {
                            switch (civil) {
                                case "s" -> civil = "Solteira";
                                case "v" -> civil = "Viuva";
                                case "c" -> civil = "Casada";
                                case "d" -> civil = "Divorciada";
                            }
                        }
       else if (sexo.equals("Maculino")){
                            switch (civil) {
                                case "s" -> civil = "Solteiro";
                                case "v" -> civil = "Viuvo";
                                case "c" -> civil = "Casado";
                                case "d" -> civil = "Divorciado";
                            }
       }
       else if (sexo.equals("Nao indentificado")){
                            switch (civil) {
                                case "s" -> civil = "Solteirx";
                                case "v" -> civil = "Viuvx";
                                case "c" -> civil = "Casadx";
                                case "d" -> civil = "Divorciadx";
                            }
                        }
        System.out.println("Nome: "+nome+"\nSexo: "+sexo+"\nIdade: "+idade
        +"\nEstado Civil: "+civil+"\nSalario de: "+salario);
    }

    public static void main(String[] args) {
        validacao validou = new validacao();
        validou.valide(null,0,0,null,null);
    }
}
