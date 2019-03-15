package br.com.senac;

public class testeparimpar {

    public static void main(String[] args) {
        int numero = 7;
        int resultado = numero / 2;
        int resto = numero % 2;
        boolean teste = (resto == 0);
        if (resto == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");

        }

    }

}
