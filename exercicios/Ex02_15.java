// Exercício 2.15: Ex02_15.java
// Aritmética

import java.util.Scanner;

public class Ex02_15 {

    public static void main (String[] args) {

        int numero1;
        int numero2;
        int soma;
        int produto;
        int diferenca;
        int quociente; //divisão

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Insira outro numero inteiro: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;
        produto = numero1 * numero2;
        diferenca = numero1 - numero2;
        quociente = numero1 / numero2;

        System.out.printf("A soma e %d%n", soma);
        System.out.printf("O produto e %d%n", produto);
        System.out.printf("A diferenca e %d%n", diferenca);
        System.out.printf("O quociente e %d%n", quociente);

    }
}