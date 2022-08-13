// Exercício 2.26: Ex02_26.java
// Múltiplos

import java.util.Scanner;

public class Ex02_26 {

    public static void main (String[] args) {

        int numero1;
        int numero2;
        int divisao;
        int resto;

        Scanner input = new Scanner(System.in);

        System.out.printf("%nInsira um inteiro: ");
        numero1 = input.nextInt();

        System.out.printf("%nInsira um inteiro: ");
        numero2 = input.nextInt();

        divisao = numero1 / numero2;
        resto = numero1 % numero2;

        if (resto == 0) {
            System.out.printf("%n%d e multiplo de %d%n", numero1, numero2);
            System.out.printf("%n%d dividido por %d = %d%n%n", numero1, numero2, divisao);
        }

        if (resto != 0) {
            System.out.printf("%n%d nao e multiplo de %d%n%n", numero1, numero2);
        }
    }
}