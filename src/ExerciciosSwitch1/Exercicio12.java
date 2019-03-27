
package ExerciciosSwitch1;

import java.util.Scanner;


public class Exercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o dia da semana");
        int diaSemana = teclado.nextInt(); // String diaSemana = teclado.nextLine();
        System.out.println("Entre com o valor");
        double valor = teclado.nextDouble();
        switch (diaSemana) { // swicht (diaSemana.toLowerCase(); Independente de usuario digitar maiusculo ou minusculo executa igual.
            case 2:// "terça-feira"; terça;
            case 4:// "quinta-feira"; quinta;
                //desconto de terça e quinta;
                double novoValor = valor * 0.75; //ou * 75 / 100;
                System.out.println("Valor original: " + valor);
                System.out.println("Desconto: 25%");
                System.out.println("Valor final: " + novoValor);
                // 25%
                break;
            case 3:// "desconto de quarta-feira"; "quarta";
                double novoValor10 = valor * 0.9;// ou valor * 90 / 100;
                System.out.println("Valor original: " + valor);
                System.out.println("Desconto: 10%");
                System.out.println("Valor final: " + novoValor10);
                // 10%
                break;
            default:
                double novoValor20 = valor * 0.975;
                System.out.println("Valor original: " + valor);
                System.out.println("Desconto: 2.5%");
                System.out.println("Valor final: " + novoValor20);
                // 2,5%
                break;

        }

    }
}
