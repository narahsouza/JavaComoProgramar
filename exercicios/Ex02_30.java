// Exercício 2.30: Ex02_30.java
// Separando os dígitos em um inteiro

import java.util.Scanner;

public class Ex02_30 {

    public static void main (String [] args) {

        int numero;
        int resto;
        int primeiro;
        int segundo;
        int terceiro;
        int quarto;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero de cinco digitos: ");
        numero = input.nextInt();

        primeiro = numero / 10000;
        resto = numero % 10000;

        segundo = resto / 1000;
        resto = resto % 1000;

        terceiro = resto / 100;
        resto = resto % 100;

        quarto = resto / 10;
        resto = resto % 10;

        System.out.printf("%d %d %d %d %d", primeiro, segundo, terceiro, quarto, resto);

    }
}