/*
Escreva um algoritmo que calcule o número de notas que deve ser dado de troco.
O algoritmo deve ler o valor total da compra e o valor pago, ambos valores inteiros. 
Suponha que o troco seja dado somente com as notas de 50, 20, 10, 5, 2 e 1 real. 
Mostre apenas as notas que efetivamente serão usadas no troco. 
Ex.: Troco: 33 
1 de 20 
1 de 10 
2 de 2
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
        int valorcompra = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR TOTAL DA COMPRA: "));
        int valorpago = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DO PAGAMENTO: "));
        int troco = valorpago - valorcompra;

        String txt = "troco: " + troco;

        if (troco / 50 > 0) {
            int qtdCedulas50 = troco / 50;
            troco = troco - (qtdCedulas50 * 50);
            txt += "\n" + qtdCedulas50 + "x 50";
        }
        if (troco / 20 > 0) {
            int qtdCedulas20 = troco / 20;
            troco = troco - (qtdCedulas20 * 20);
            txt += "\n" + qtdCedulas20 + "x 20";
        }
        if (troco / 10 > 0) {
            int qtdCedulas10 = troco / 10;
            troco = troco - (qtdCedulas10 * 10);
            txt += "\n" + qtdCedulas10 + "x 10";
        }
        if (troco / 5 > 0) {
            int qtdCedulas5 = troco / 5;
            troco = troco - (qtdCedulas5 * 5);
            txt += "\n" + qtdCedulas5 + "x 5";
        }
        if (troco / 2 > 0) {
            int qtdCedulas2 = troco / 2;
            troco = troco - (qtdCedulas2 * 2);
            txt += "\n" + qtdCedulas2 + "x 2";
        }
        if (troco / 1 > 0) {
            int qtdCedulas1 = troco / 1;
            troco = troco - (qtdCedulas1 * 1);
            txt += "\n" + qtdCedulas1 + "x 1";
        }

        JOptionPane.showMessageDialog(null, txt);

    }
}
