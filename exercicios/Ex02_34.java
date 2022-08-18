// Exercício 2.34: Ex02_34.java
// Calculadora de crescimento demográfico mundial

public class Ex02_34 {
    
    public static void main (String[] args) {
        
        int populacaoMundial = 7753;
        int taxaCrescimentoAnual = 0012; // Adaptado para calcular a porcentagem sem a virgula
        int ajusteInteiro = 1000; // Ajustar a porcentagem ao valor correto

        int ano1 = populacaoMundial + taxaCrescimentoAnual * populacaoMundial / ajusteInteiro;
        int ano2 = ano1 + taxaCrescimentoAnual * ano1 / ajusteInteiro;
        int ano3 = ano2 + taxaCrescimentoAnual * ano2 / ajusteInteiro;
        int ano4 = ano3 + taxaCrescimentoAnual * ano3 / ajusteInteiro;
        int ano5 = ano4 + taxaCrescimentoAnual * ano4 / ajusteInteiro;

        System.out.printf("%n - População mundial atual: %d bi%n", populacaoMundial);
        System.out.printf("%n - População mundial estimada depois de um ano: %d bi%n", ano1);
        System.out.printf("%n - População mundial estimada depois de dois anos: %d bi%n", ano2);
        System.out.printf("%n - População mundial estimada depois de três anos: %d bi%n", ano3);
        System.out.printf("%n - População mundial estimada depois de quatro anos: %d bi%n", ano4);
        System.out.printf("%n - População mundial estimada depois de cinco anos: %d bi%n", ano5);
        
    }
}
