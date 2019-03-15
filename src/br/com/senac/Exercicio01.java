package br.com.senac;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int x = t.nextInt();
        System.out.println(+ (--x) + " é antecessor de: " + (++x));
        x++;
        System.out.println(+ (x) + " é sucessor de: " + (--x));
        
        

    }

}
