import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro: ");
        int number = scanner.nextInt();

        String result;

        if (number % 2 == 0){
            result = "O número é 'Par'.";
        } else {
            result = "O número é 'Ímpar'.";
        }
        
        System.out.println(result);

        scanner.close();
    }
}
