// Exercício 2.32: Ex02_32.java
// Valores negativos, positivos e zero

import java.util.Scanner;

public class Ex02_32 {

    public static void main (String[] args) {

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        int zeros = 0;
        int positivos = 0;
        int negativos = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira cinco numeros: ");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();
        numero4 = input.nextInt();
        numero5 = input.nextInt();

        // ZEROS

        if (numero1 == 0)
            zeros += 1;

        if (numero2 == 0)
            zeros += 1;
        
        if (numero3 == 0)
            zeros += 1;
        
        if (numero4 == 0)
            zeros += 1;
        
        if (numero5 == 0)
            zeros += 1;

        // POSITIVOS

        if (numero1 > 0)
            positivos += 1;

        if (numero2 > 0)
            positivos += 1;
        
        if (numero3 > 0)
            positivos += 1;
        
        if (numero4 > 0)
            positivos += 1;
        
        if (numero5 > 0)
            positivos += 1; 

        // NEGATIVOS

        if (numero1 < 0)
            negativos += 1;

        if (numero2 < 0)
            negativos += 1;
        
        if (numero3 < 0)
            negativos += 1;
        
        if (numero4 < 0)
            negativos += 1;
        
        if (numero5 < 0)
            negativos += 1; 

        System.out.printf("Quantos zeros foram inseridos: %d%n", zeros);
        System.out.printf("Quantos positivos foram inseridos: %d%n", positivos);
        System.out.printf("Quantos negativos foram inseridos: %d%n", negativos);

    }
}