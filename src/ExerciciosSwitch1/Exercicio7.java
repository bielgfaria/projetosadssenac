// Pegar do usuário dois nomes de pessoa e apresentar o nome com mais caracteres
package ExerciciosSwitch1;

import javax.swing.JOptionPane;


public class Exercicio7 {
    public static void main(String[] args) {
        String t1 = JOptionPane.showInputDialog("Digite primeiro nome: ");
        String t2 = JOptionPane.showInputDialog("Digite segundo nome: ");
        int letra = t1.length();
        int letra2 = t2.length();
        if (letra > letra2) {
            JOptionPane.showMessageDialog(null, t1 + " É o maior nome e tem: " + letra + " letras.");
        }
        if (letra2 > letra) {
            JOptionPane.showMessageDialog(null, t2 + " É o maior nome e tem: " + letra2 + " letras.");
        }
        if (letra == letra2) {
            JOptionPane.showMessageDialog(null, "Os dois nomes tem a mesma quantidade de caracteres." );
            
        }
    }
    
}
