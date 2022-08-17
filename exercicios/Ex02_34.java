// Exercício 2.34: Ex02_34.java
// Calculadora de crescimento demográfico mundial

public class Ex02_34 {
    
    public static void main (String[] args) {
        
        double populacaoMundial = 7753;
        double taxaCrescimentoAnual = 0011 * populacaoMundial;

        double ano1 = taxaCrescimentoAnual + populacaoMundial;
        double ano2 = taxaCrescimentoAnual * 2 + populacaoMundial;
        double ano3 = taxaCrescimentoAnual * 3 + populacaoMundial;
        double ano4 = taxaCrescimentoAnual * 4 + populacaoMundial;
        double ano5 = taxaCrescimentoAnual * 5 + populacaoMundial;

        System.out.printf("População mundial estimada depois de um ano: %d%n bi", ano1);
        System.out.printf("População mundial estimada depois de dois anos: %d%n bi", ano2);
        System.out.printf("População mundial estimada depois de três anos: %d%n bi", ano3);
        System.out.printf("População mundial estimada depois de quatro anos: %d%n bi", ano1);
        System.out.printf("População mundial estimada depois de cinco anos: %d%n bi", ano1);
    }

}
