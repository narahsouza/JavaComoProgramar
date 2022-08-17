// Exercício 2.33: Ex02_33.java
// Calculadora de índice de massa corporal

import java.util.Scanner;

public class Ex02_33 {

    public static void main (String[] args) {

        int peso;
        int altura;
        //int imc;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o seu peso em quilogramas: ");
        peso = input.nextInt();
        
        System.out.print("Insira a sua altura em centimetros: ");
        altura = input.nextInt();

        System.out.printf("Seu IMC: %f%n", peso / altura / altura * 10000);

        System.out.printf("%nBMI VALUES %nUnderweight: less than 18.5 %nNormal: between 18.5 and 24.9 %nOverweight: between 25 and 29.9 %nObese: 30 or greater");

    }
}