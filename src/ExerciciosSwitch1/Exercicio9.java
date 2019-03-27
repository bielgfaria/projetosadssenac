/*
 * 9. Crie um programa que solicite três notas de aluno. 
Faça a média aritmética e apresente a informação “Aprovado” se a média for maior que 7;
“Prova final” se a média for menor que 7 e maior ou igual a 5; “Reprovado” se a média for menor que 5.
 */
package ExerciciosSwitch1;

import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {
        String t1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        double n1 = Double.valueOf(t1);
        String t2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        double n2 = Double.valueOf(t2);
        String t3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
        double n3 = Double.valueOf(t3);
        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado.");
        }
        if (media < 7 && (media >= 5)) {
            JOptionPane.showMessageDialog(null, "Prova Final.");
        }
        if (media < 5) {
            JOptionPane.showMessageDialog(null, "Reprovado.");
        }
    }
}
