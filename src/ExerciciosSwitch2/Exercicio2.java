/*
 Crie um programa que leia do usuário 4 números inteiros. Apresente o maior e o menor deles.
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        String int1 = JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO:");
        int inteiro1 = Integer.valueOf(int1);
        String int2 = JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO:");
        int inteiro2 = Integer.valueOf(int2);
        String int3 = JOptionPane.showInputDialog("DIGITE O TERCEIRO NUMERO:");
        int inteiro3 = Integer.valueOf(int3);
        String int4 = JOptionPane.showInputDialog("DIGITE O QUARTO NUMERO:");
        int inteiro4 = Integer.valueOf(int4);
        if (inteiro1 > inteiro2 && inteiro1 > inteiro3 && inteiro1 > inteiro4) {
            JOptionPane.showMessageDialog(null, "NUMERO MAIOR: " + inteiro1);
        } else if (inteiro2 > inteiro1 && inteiro2 > inteiro3 && inteiro2 > inteiro4) {
            JOptionPane.showMessageDialog(null, "NUMERO MAIOR: " + inteiro2);
        } else if (inteiro3 > inteiro1 && inteiro3 > inteiro2 && inteiro3 > inteiro4) {
            JOptionPane.showMessageDialog(null, "NUMERO MAIOR: " + inteiro3);
        } else {
            JOptionPane.showMessageDialog(null, "NUMERO MAIOR: " + inteiro4);

        }
        if (inteiro1 < inteiro2 && inteiro1 < inteiro3 && inteiro1 < inteiro4) {
            JOptionPane.showMessageDialog(null, "NUMERO MENOR: " + inteiro1);
        } else if (inteiro2 < inteiro1 && inteiro2 < inteiro3 && inteiro2 < inteiro4) {
            JOptionPane.showMessageDialog(null, "NUMERO MENOR: " + inteiro2);
        } else if (inteiro3 < inteiro1 && inteiro3 < inteiro2 && inteiro3 < inteiro4) {
            JOptionPane.showMessageDialog(null, "NUMERO MENOR: " + inteiro3);
        } else {
            JOptionPane.showMessageDialog(null, "NUMERO MENOR: " + inteiro4);

        }

    }

}
