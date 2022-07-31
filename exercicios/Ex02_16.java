// Exercício 2.16: Ex02_16.java
// Comparando inteiros

import java.util.Scanner;

public class Ex02_16 {

    public static void main (String[] args) {

        int x;
        int y;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um inteiro: ");
        x = input.nextInt();

        System.out.print("Insira um inteiro: ");
        y = input.nextInt();

        if (x > y) {
            System.out.printf("%d is larger", x);
        }

        if (x < y) {
            System.out.printf("%d is larger", y);
        }
        
        if (x == y) {
            System.out.printf("These numbers are equal.");
        }                  
    }
}