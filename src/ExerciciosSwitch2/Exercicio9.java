/*
Faça um algoritmo que peça o valor total de uma compra (decimal) e solicite a forma de pagamento
conforme a informação que o usuário digitar: 
"D" - Dinheiro ou Débito - Calcule o valor da compra com 15% de desconto;
"C" - Crédito - Calcule o valor da compra com 5% de desconto; 
"2" - Crediário em 2x - Calcule o valor da parcela sobre o valor total; 
"3" - Crediário em 3x - Acrescente 10% no valor da compra e calcule o valor da parcela; 
Outro valor - Apresente a mensagem de opção inválida
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {
        double vtotal = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA COMPRA:"));

        String[] fpaga = {"DINHEIRO", "CARTAO DEBITO", "CARTAO CREDITO", "CREDIARIO EM 2X", "CREDIARIO EM 3X"};

        String valor1 = String.valueOf(JOptionPane.showInputDialog(
                null, "Selecione uma opção abaixo:", "FORMA DE PAGAMENTO", JOptionPane.QUESTION_MESSAGE, null,
                fpaga, fpaga[1] + fpaga[2] + fpaga[3] + fpaga[4]));
        double dinheiroedebito = vtotal * 15 / 100;
        double credito = vtotal * 5 / 100;
        double crediario2 = vtotal / 2;
        double crediario3 = vtotal * 10 / 100;

        if (valor1.equalsIgnoreCase("DINHEIRO")) {
            JOptionPane.showMessageDialog(null, "À VISTA: " +(int) (vtotal - dinheiroedebito)+"R$");

        }
        if (valor1.equalsIgnoreCase("CARTAO DEBITO")) {
            JOptionPane.showMessageDialog(null, "CARTAO DE DEBITO: " +(int) (vtotal - dinheiroedebito)+"R$");
        }
        if (valor1.equalsIgnoreCase("CARTAO CREDITO")) {
            JOptionPane.showMessageDialog(null, "CARTAO DE CREDITO: " +(int) (vtotal - credito)+"R$");
        }
        if (valor1.equalsIgnoreCase("CREDIARIO EM 2X")) {
            JOptionPane.showMessageDialog(null, "FICA EM DUAS VEZES DE: " +(int) crediario2 +"R$");
        }
        if (valor1.equalsIgnoreCase("CREDIARIO EM 3X")) {
            JOptionPane.showMessageDialog(null, "NO CREDIARIO FICA: " + (int) (vtotal + crediario3)+"R$" + " EM 3 VEZES DE: "
                    +(int) (vtotal + crediario3) / 3+"R$");
        }

    }

}
