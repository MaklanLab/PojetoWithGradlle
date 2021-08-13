package Praticando;



public class Produto_MaisBarato {
    public static void main(String[] args) {
        var a = 102;
        var b = 165;
        var c = 187;
        if (a<b && a<c) System.out.println("Compre o produto (A)");
        else if (b<c && b< a) System.out.println("Compre o produto (B)");
        else if (c<a && c<b) System.out.println("Compre o produto (C)");
    }
}
