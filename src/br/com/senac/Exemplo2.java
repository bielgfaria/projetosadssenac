
package br.com.senac;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int valor = teclado.nextInt();
        teclado.nextLine();
        int resto = valor % 2;
        System.out.println(valor + " é par: " + (resto == 0));
        System.out.println("Qual seu nome?");
        String nome = teclado.nextLine();
        System.out.println("> " + nome);
        
       
        
        
        
        
    }
    
}
