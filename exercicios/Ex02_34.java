// Exercício 2.34: Ex02_34.java
// Calculadora de crescimento demográfico mundial

public class Ex02_34 {
    
    public static void main (String[] args) {
        
        int populacaoMundial = 7753;
        int taxaCrescimentoAnual = 0011 * populacaoMundial;

        int ano1 = taxaCrescimentoAnual + populacaoMundial;
        int ano2 = taxaCrescimentoAnual * 2 + populacaoMundial;
        int ano3 = taxaCrescimentoAnual * 3 + populacaoMundial;
        int ano4 = taxaCrescimentoAnual * 4 + populacaoMundial;
        int ano5 = taxaCrescimentoAnual * 5 + populacaoMundial;

        System.out.printf("População mundial estimada depois de um ano: %d bi", ano1);
        System.out.printf("População mundial estimada depois de dois anos: %d bi", ano2);
        System.out.printf("População mundial estimada depois de três anos: %d bi", ano3);
        System.out.printf("População mundial estimada depois de quatro anos: %d bi", ano1);
        System.out.printf("População mundial estimada depois de cinco anos: %d bi", ano1);
    }

}
