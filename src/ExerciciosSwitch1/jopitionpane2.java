
package ExerciciosSwitch1;

import javax.swing.JOptionPane;


public class jopitionpane2 {
    public static void main(String[] args) {
        String si = JOptionPane.showInputDialog("Digite um inteiro");
        int inteiro = Integer.valueOf(si);
        String sd = JOptionPane.showInputDialog("Digite um decimal");
        double decimal = Double.valueOf(sd);
        System.out.println("Inteiro digitado: " + inteiro);
        System.out.println("Decimal digitado: " + decimal);
        
    }
    
}
