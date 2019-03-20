
package ExerciciosDia20;

import java.util.Scanner;


public class CadastroNomeNumCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome da rua onde você mora? ");
        String resposta = teclado.nextLine();
        System.out.println("A quantidade de caracteres é: " + resposta.length());
        
    }
}

