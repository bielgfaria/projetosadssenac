/*
 Crie um programa que leia do usuário 5 números inteiros. Apresente a média e os números que são maiores que a média.
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO: ");
        int inteiro = Integer.valueOf(numero);
        String numero1 = JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO: ");
        int inteiro1 = Integer.valueOf(numero1);
        String numero2 = JOptionPane.showInputDialog("DIGITE O TERCEIRO NUMERO: ");
        int inteiro2 = Integer.valueOf(numero2);
        String numero3 = JOptionPane.showInputDialog("DIGITE O QUARTO NUMERO: ");
        int inteiro3 = Integer.valueOf(numero3);
        String numero4 = JOptionPane.showInputDialog("DIGITE O QUINTO NUMERO: ");
        int inteiro4 = Integer.valueOf(numero4);
        double media = (inteiro + inteiro1 + inteiro2 + inteiro3 + inteiro4) / 5;
        JOptionPane.showMessageDialog(null, "A MEDIA É: " + media);
        
        String mensagem = "Maior que a média:";
        if (inteiro > media){
            mensagem += " " + inteiro;            
        }
        if (inteiro1 > media){
            mensagem += " " + inteiro1;            
        }
        if (inteiro2 > media){
            mensagem += " " + inteiro2;            
        }
        if (inteiro3 > media){
            mensagem += " " + inteiro3;            
        }
        if (inteiro4 > media){
            mensagem += " " + inteiro4;     
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

}
