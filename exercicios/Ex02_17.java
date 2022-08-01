// Exercício 2.17: Ex02_17.java
// Aritmética, menor e maior

import java.util.Scanner;

public class Ex02_17 {

    public static void main (String[] args) {

        int numero1;
        int numero2;
        int numero3;

        int soma;
        int media;
        int produto;
        
        // INSERIR OS NUMEROS

        Scanner input = new Scanner(System.in);

        System.out.printf("%nDigite abaixo tres numeros inteiros:%n%n");

        System.out.print("Digite o primeiro numero = ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo numero = ");
        numero2 = input.nextInt();

        System.out.print("Digite o terceiro numero = ");
        numero3 = input.nextInt();

        System.out.println();

        // COMPARACAO PRIMEIRO E SEGUNDO NUMERO

        if (numero1 == numero2) 
            System.out.printf("%d = %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);   

        // COMPARACAO SEGUNDO E TERCEIRO NUMERO

        if (numero2 == numero3) 
            System.out.printf("%d = %d%n", numero2, numero3);

        if (numero2 < numero3)
            System.out.printf("%d < %d%n", numero2, numero3);

        if (numero2 > numero3)
            System.out.printf("%d > %d%n", numero2, numero3);

        // COMPARACAO TERCEIRO E PRIMEIRO NUMERO

        if (numero3 == numero1) 
            System.out.printf("%d = %d%n", numero3, numero1);

        if (numero3 < numero1)
            System.out.printf("%d < %d%n", numero3, numero1);

        if (numero3 > numero1)
            System.out.printf("%d > %d%n", numero3, numero1);

        // OPERACOES
        
        soma = numero1 + numero2 + numero3;
        media = soma / 3;
        produto = numero1 * numero2 * numero3;

        // RESULTADOS

        System.out.printf("%nSoma: %d%n", soma);
        System.out.printf("Media: %d%n", media);
        System.out.printf("Produto: %d%n", produto);
        
    }
}