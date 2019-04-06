/*
 *Crie um programa que apresente no console todos os números múltiplos de três de 1 a 100, um ao lado do outro. 
Ao final, na linha seguinte, apresente a quantidade de números apresentados.
 */
package br.com.senac;

/**
 *
 * @author 55489
 */
public class Exercicio06 {
    public static void main(String[] args) {
        int numero = 1;
        int resultado = 0;
        while (numero < 101) {
            if (numero % 3 == 0) {
                System.out.print("-" + numero);
                resultado++;                
            }
            numero++;           
        }
        System.out.println("\n" + resultado);
        
    
        
    }
    
}
