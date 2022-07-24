// Este programa calculará o produto de três inteiros.

import java.util.Scanner;

public class Ex02_06 {

	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);

	int x;
	int y;
	int z;
	int result;

	System.out.print("Insira o primeiro inteiro: ");
	x = input.nextInt();

	System.out.print("Insira o segundo inteiro: ");
	y = input.nextInt();

	System.out.print("Insira o terceiro inteiro: ");
	z = input.nextInt();

	result = x * y * z;

	System.out.printf("Product is %d%n", result);

	}
}