/*
 Crie um programa que solicite dois números inteiros ao usuário. 
Depois apresente um por um dizendo se é par ou ímpar. Ao final diga se o primeiro é divisível pelo segundo (resto da divisão igual a zero).
 */
package ExerciciosSwitch1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Exercicio8 {

    public static void main(String[] args) {
        String t1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro: ");
        int n1 = Integer.valueOf(t1);
        String t2 = JOptionPane.showInputDialog("Digite o segundo número inteiro; ");
        int n2 = Integer.valueOf(t2);
        if (n1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O primeiro numero é par:" + n1);
        } else {
            JOptionPane.showMessageDialog(null, "O primeiro numero é impar:" + n1);
        }
        if (n2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O segundo numero é par:" + n2);
        } else {
            JOptionPane.showMessageDialog(null, "O segundo numero é impar:" + n2);    
        
        }
        
        
        if (n1 % n2 == 0) {

            JOptionPane.showMessageDialog(null, "O primeiro numero é divisivel pelo segundo.");

        } else {
            JOptionPane.showMessageDialog(null, "O primeiro numero não é divisivel pelo segundo.");

        }
    }
}
    
