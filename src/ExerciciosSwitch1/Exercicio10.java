// crie um conversor de temperatura ususario apresente um numero, e tenha duas opçoes para escolher
// 1 celsisus para farenheit 2 farenheit para celsius.
package ExerciciosSwitch1;

import javax.swing.JOptionPane;

/**
 * Object [] temperatura = {"Celsius p/ farenheit","Farenheit p/celsius"}; *
 * String valor1 = String.valueOf(JOptionPane.showInputDialog( null, "Selecione
 * uma opção abaixo:","ESCOLHA", JOptionPane.QUESTION_MESSAGE,null,
 * temperatura,temperatura[1]));
 *
 * @author 55489
 */
public class Exercicio10 {

    public static void main(String[] args) {
        String t1 = JOptionPane.showInputDialog("DIGITE A TEMPERATURA: ");
        double n1 = Double.valueOf(t1);
        double farenheit = n1 * 1.8 + 32;
        double celcius = (n1 - 32) / 1.8;
        Object[] temperatura = {"Celsius p/ farenheit", "Farenheit p/celsius"};

        String valor1 = String.valueOf(JOptionPane.showInputDialog(
                null, "Selecione uma opção abaixo:", "ESCOLHA", JOptionPane.QUESTION_MESSAGE, null,
                temperatura, temperatura[1]));
        JOptionPane.showMessageDialog(null, "CELCIUS:  " + (int) celcius + " Cº");
        JOptionPane.showMessageDialog(null, "FARENHEIT:  " + farenheit + " Fº");

    }
}
