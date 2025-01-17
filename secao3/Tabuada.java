import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Mensagem para o usuário
        System.out.println("Digite um número para ver a Tabuada: ");
        int number = scanner.nextInt();

        System.out.println("A Tabuada do numero " + number + " é:");
        System.out.println(number + " x 1: " + (number * 1));
        System.out.println(number + " x 2: " + (number * 2));
        System.out.println(number + " x 3: " + (number * 3));
        System.out.println(number + " x 4: " + (number * 4));
        System.out.println(number + " x 5: " + (number * 5));
        System.out.println(number + " x 6: " + (number * 6));
        System.out.println(number + " x 7: " + (number * 7));
        System.out.println(number + " x 8: " + (number * 8));
        System.out.println(number + " x 9: " + (number * 9));

        scanner.close();
    }
}
