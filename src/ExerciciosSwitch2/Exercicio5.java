/*
 Crie um programa que leia dois números inteiros. 
Obtenha o resto da divisão inteiro do primeiro pelo segundo e execute conforme:
- Se o resto for 0 apresente a mensagem "Bazinga"; 
- Se o resto for 1 apresente a soma dos dois números inteiros; 
- Se o resto for 2 apresente a multiplicação dos dois números inteiros; 
- Se o resto for 5 apresente o quadrado dos dois números
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO: "));
        int divisao = num1 % num2;
        if (divisao == 0) {
            JOptionPane.showMessageDialog(null, "BAZINGA.");
        }
        if (divisao == 1) {
            JOptionPane.showMessageDialog(null, "SOMA DOS INTEIROS: " + (num1 + num2));

        }
        if (divisao == 2) {
            JOptionPane.showMessageDialog(null,"MULTIPLICAÇAO: " + (num1 * num2));
            
        }
        if (divisao == 5) {
            JOptionPane.showMessageDialog(null, "QUADRADO DO PRIMEIRO E SEGUNDO: " + (num1*num1)  + " " + (num2*num2));
            
            
        }

    }

}
