/*
 4.	Crie um programa que gere um número aleatório entre -50 e 50 e depois apresente: 
(i) o número gerado; (ii) se o número gerado é par o ímpar; (iii) apresente se o número é positivo ou negativo.
 */
package ExerciciosSwitch1;

/**
 *
 * @author Alunos
 */
public class exercicio4 {
    public static void main(String[] args) {
        double random = (int) (Math.random() * 100) - 50;
        System.out.println(random);
        int resto = (int) (random % 2);
        boolean par = resto == 0;
        if (par) {
            System.out.println("PAR: " + par);
        } else {
            System.out.println("IMPAR" + !par); //! negativo que nao é par entao é impar.
        }
        if (random > 0) {
            System.out.println("Positivo");            
        }
            if (random <0) {
                System.out.println("Negativo");
            }
        
    }
}
