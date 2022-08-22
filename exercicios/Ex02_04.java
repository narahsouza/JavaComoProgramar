// Exercício 2.4: Ex02_04.java

import java.util.Scanner;

public class Ex02_04 {

    public static void main (String [] args) {
        
        int c;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        c = input.nextInt();

        if (c < 7)
	        System.out.println("c is less than 7");

        if (c >= 7)
	        System.out.println("c is equal to or greater than 7");

    }
}