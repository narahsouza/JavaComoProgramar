// Exercício 3.01: Ex03_01.java
// Addition program that displays the sum of two numbers.
import javax.swing.JOptionPane;

public class Ex03_01 
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      String entrada1; // first number to enter
      String entrada2; // second number to enter
      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2
      String message;

      // prompt user to enter number1
      entrada1 = JOptionPane.showInputDialog("Enter first integer:");
      number1 = Integer.parseInt(entrada1); // Converte entrada1 para inteiro

      // prompt user to enter number2
      entrada2 = JOptionPane.showInputDialog("Enter second integer:");
      number2 = Integer.parseInt(entrada2); // Converte entrada2 para inteiro
      
      sum = number1 + number2; // add numbers, then store total in sum

      // create the message
      message = String.format("Sum is %d%n", sum); 

      // display the message to welcome the user by name 
      JOptionPane.showMessageDialog(null, message);

   } // end method main
} // end class Ex03_01


