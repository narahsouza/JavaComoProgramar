// Exercício 2.25: Ex02_25.java
// Ímpar ou par

import java.util.Scanner;

public class Ex02_25 {

    public static void main (String[] args) {

        int inteiro;
        int resto;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um inteiro: ");
        inteiro = input.nextInt();

        resto = inteiro % 2;

        if (resto == 0)
            System.out.printf("%d é um numero par.", inteiro);

        if (resto != 0)
            System.out.printf("%d é um numero impar.", inteiro);

    }
}