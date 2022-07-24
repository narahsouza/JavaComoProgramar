import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
	
		int c;
		int thisIsAVariable;
		int q76354;
		int number;

		System.out.print("Insira um inteiro: ");
		Scanner input = new Scanner(System.in);

		int value = input.nextInt();

		System.out.println("This is a Java program");
		System.out.printf("%s%n%s%n", "This is a Java", "program");
	
		number = value;

		if (number != 7) {
			System.out.print("The variable number is not equal to 7");
		}
	}
}