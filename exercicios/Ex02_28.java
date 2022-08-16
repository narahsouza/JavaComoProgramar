// Exercício 2.28: Ex02_28.java
// Diâmetro, circunferência e área de um círculo

import java.util.Scanner;

public class Ex02_28 {

    public static void main (String[] args) {

        int raio;
        double diametro;
        double circunferencia;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio de um circulo como um inteiro: ");
        raio = input.nextInt();

        diametro = 2 * raio;
        circunferencia = 2 * Math.PI * raio;
        area = Math.PI * raio * raio;

        System.out.printf("Diametro = %f%n", diametro);
        System.out.printf("Circunferencia = %f%n", circunferencia);
        System.out.printf("Area = %f%n", area);
    }
}
