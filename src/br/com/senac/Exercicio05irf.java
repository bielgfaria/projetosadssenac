package br.com.senac;

import java.util.Scanner;

public class Exercicio05irf {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x = teclado.nextDouble();
        if (x <= 1999.18) {
            System.out.println("Aliquota é de 0%");

        }
        if (x >= 1999.18 && x <= 2967.98) {
            System.out.println("Aliquota de 7.5%: " + x * 7.5 / 100);

        }
        if (x >= 2967.98 && x <= 3938.60) {
            System.out.println("Aliquota de 15%: " + x * 15 / 100);

        }
        if (x >= 3938.60 && x <= 4897.91) {
            System.out.println("Aliquota de 22.5%: " + x * 22.5 / 100);

        }
        if (x >= 4897.91) {
            System.out.println("Aliquota de 27.5%: " + x * 27.5 / 100);
        }

    }
}
