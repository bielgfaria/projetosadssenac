package br.com.senac;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        double a = 1;
        double b = -5;
        double c = 6;
        double delta = (b * b) - 4 * a * c;
        Math.sqrt(delta);
        if (delta > 0) {
            double raizUm = (-b + Math.sqrt(delta)) / 2 * a;
            double raizDois = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println(raizUm + " e " + raizDois);

        }
        if (delta < 0) {
            System.out.println("RaizInexistente");

        }
        if (delta == 0) {
            double Raiz = -b / (2 * a);
            System.out.println(Raiz);
        }

    }

}
