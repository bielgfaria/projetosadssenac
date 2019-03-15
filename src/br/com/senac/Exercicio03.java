package br.com.senac;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int a = t.nextInt();
        int randomico = (int) (Math.random() * 10);
        System.out.println("a=" + a);
        System.out.println("r=" + randomico);
        System.out.println("a > r:" + (a > randomico));
        a++;
        randomico = randomico * 30;
        if (a > randomico) {
            System.out.println("Maior é A:" + a);
        } else {
            System.out.println("Maior é R:" + randomico);
        }
        
    }
}
