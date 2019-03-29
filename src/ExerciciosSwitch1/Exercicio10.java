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
        Double t1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A TEMPERATURA: "));

        double farenheit = t1 * 1.8 + 32;
        double celcius = (t1 - 32) / 1.8;
        String[] temperatura = {"Celsius p/ farenheit", "Farenheit p/celsius"};

        String valor1 = String.valueOf(JOptionPane.showInputDialog(
                null, "Selecione uma opção abaixo:", "ESCOLHA", JOptionPane.QUESTION_MESSAGE, null,
                temperatura, temperatura[1]));

        if (valor1.equalsIgnoreCase("Celsius p/ farenheit")) {
            JOptionPane.showMessageDialog(null, "FARENHEIT:  " + farenheit + " Fº");
        } else {
            
            
            
            
            

            JOptionPane.showMessageDialog(null, "CELCIUS:  " + (int) celcius + " Cº");
        }

    }
}
