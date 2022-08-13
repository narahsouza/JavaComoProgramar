// Exercício 2.24: Ex02_24.java
// Inteiros maiores e menores

import java.util.Scanner;

public class Ex02_24 {

    public static void main (String[] args) {

        int a;
        int b;
        int c;
        int d;
        int e;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um inteiro: ");
        a = input.nextInt();

        System.out.print("Insira um inteiro: ");
        b = input.nextInt();

        System.out.print("Insira um inteiro: ");
        c = input.nextInt();

        System.out.print("Insira um inteiro: ");
        d = input.nextInt();

        System.out.print("Insira um inteiro: ");
        e = input.nextInt();

        int menor = a;
        int maior = a;

        // MENOR

        if (b < menor)
            menor = b;
            
        if (c < menor)
            menor = c;

        if (d < menor)
            menor = d;

        if (e < menor)
            menor = e;        

        // MAIOR

        if (b > maior)
            maior = b;
            
        if (c > maior)
            maior = c;

        if (d > maior)
            maior = d;

        if (e > maior)
            maior = e;

        System.out.printf("%d e o menor e %d e o maior.", menor, maior);    

    }

}