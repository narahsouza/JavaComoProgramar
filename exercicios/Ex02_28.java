// Exercício 2.28: Ex02_28.java
// Diâmetro, circunferência e área de um círculo

import java.util.Scanner;

public class Ex02_28 {

    public static void main (String[] args) {

        int raio;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio de um circulo como um inteiro: ");
        raio = input.nextInt();

        System.out.printf("Diametro = %d%n", 2 * raio);
        System.out.printf("Circunferencia = %f%n", 2 * Math.PI * raio);
        System.out.printf("Area = %f%n", Math.PI * raio * raio);
    }
}
