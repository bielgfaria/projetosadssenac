
package br.com.senac;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int x = t.nextInt();
        int resto = x % 2;
        boolean divisivelpor2 = (resto == 0);
        System.out.println("Par: " + divisivelpor2);
        resto = x % 3;
        boolean divisivelpor3 = (resto == 0);
        System.out.println("Impar: " + divisivelpor3);
        boolean divisivelpor2e3 = (divisivelpor2 & divisivelpor3);
        System.out.println("Por 2 e 3:" + divisivelpor2e3);

    }

}

