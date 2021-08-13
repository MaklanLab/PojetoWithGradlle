package Enum;

public class Teste {
    public static void main(String[] args) {
    // constantes();
    usandoEnum();
    }
    /*private static void constantes (){
        int segunda = Enum.SEGUNDA;
        int terca = Enum.TERCA;
        int quarta = Enum.QUARTA;
        int quinta = Enum.QUINTA;
        int sexta = Enum.SEXTA;
        int sabado = Enum.SABADO;
        int domingo = Enum.DOMINGO;
          System.out.println("Teste constante");
         imprimrdiaSemana(segunda);
         imprimrdiaSemana(terca);
         imprimrdiaSemana(quarta);
         imprimrdiaSemana(quinta);
         imprimrdiaSemana(sexta);
         imprimrdiaSemana(sabado);
         imprimrdiaSemana(domingo);

    }*/
    private static void imprimrdiaSemana(DiaSemana dia) {
        switch (dia)
        {
            case SEGUNDA:
                System.out.println("Segunda");
                break;
            case TERCA:
                System.out.println("Terça");
                break;
            case QUARTA:
                System.out.println("Quarta");
                break;
            case QUINTA:
                System.out.println("Quinta");
                break;
            case SEXTA:
                System.out.println("Sexta");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
        }
    }
    private static void usandoEnum (){
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        System.out.println("Utilizando Enum");
        imprimrdiaSemana(segunda);
        imprimrdiaSemana(terca);
        imprimrdiaSemana(quarta);
        imprimrdiaSemana(quinta);
        imprimrdiaSemana(sexta);
        imprimrdiaSemana(sabado);
        imprimrdiaSemana(domingo);

    }
}
