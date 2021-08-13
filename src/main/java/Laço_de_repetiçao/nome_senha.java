package Laço_de_repetiçao;

import java.util.Scanner;

public class nome_senha {
    void dados (String nome, String senha){
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        senha = sc.nextLine();
        while (nome.equals(senha)){
            System.out.println("Senha igual ao nome");
            System.out.println("digite sua senha novamente");
            senha = sc.nextLine();
        }
        while (senha.length()<8){
            System.out.println("Senha muito fraca digite novamente");
            senha = sc.nextLine();
        }
    }

    public static void main(String[] args) {
        nome_senha sera = new nome_senha();
        sera.dados(null,null);
    }
}
