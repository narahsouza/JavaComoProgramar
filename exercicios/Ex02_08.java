// Exercício 2.8: Ex02_08.java

import java.util.Scanner;

public class Ex02_08 {

    public static void main (String[] args) {

        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        b = input.nextInt();

        System.out.print("Enter an integer: ");
        c = input.nextInt();

        a = b * c;

        System.out.printf("Product is %d%n", a);
    }
}