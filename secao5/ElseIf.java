package secao5;

public class ElseIf {
    public static void main(String[] args) {
        double nota  = 10;

        if (nota == 10){
            System.out.println("Você tirou a nota máxima, Parabéns!");
        } else if (nota >= 9) {
            System.out.println("Nota muito boa!");
        } else if (nota >= 7){
            System.out.println("Nota acima da média.");
        } else {
            System.out.println("Nota abaixo da média.");
        }
        
    }
}
