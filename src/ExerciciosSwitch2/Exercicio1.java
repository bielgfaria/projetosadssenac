/*
 Fazer um algoritmo em swithcase para ler o código de um determinado produto e mostrar a sua classificação.
Utilize a seguinte tabela como referência:
1 - Alimento não perecível 2 ou 4 - Alimento perecível 3 - Higiene Pessoal 
5 ou 6 - Vestuário 8 a 15 - Eletrônicos Outro código - Código Inválido
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        String escolhaUsuario = JOptionPane.showInputDialog("DIGITE O CODIGO DO PRODUTO: ");
        int inteiro = Integer.valueOf(escolhaUsuario);
        switch (inteiro){
                case 1: 
                    JOptionPane.showMessageDialog(null, "Alimento ñ perecivel");
                    break;
                case 2:
                case 4:
                    JOptionPane.showMessageDialog(null, "Alimento perecivel");
                    break;
                case 3:
                case 7:
                    JOptionPane.showMessageDialog(null, "Higiene Pessoal");
                    break;
                case 5:
                case 6:
                    JOptionPane.showMessageDialog(null, "Vestuario");
                    break;
                case 8:                  
                case 9:                  
                case 10:                  
                case 11:                  
                case 12:                  
                case 13:                  
                case 14:                  
                case 15:
                    JOptionPane.showMessageDialog(null, "Eletronicos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Codigo Invalido");
        }
                    
                

    }

}
