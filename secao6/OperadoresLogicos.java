package secao6;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        /*
         * && (E) -> retorna TRUE se ambas as condições forem verdadeiras
         * || (OU) -> retorna TRUE se pelo menos uma das condições forem verdadeiras
         * ! (NÃO) -> inverte o valor lógico; retorna TRUE se a condição for falsa e vice-versa
         * Comibinação -> pode combinar múltiplas condições em uma única expressão lógica
         */

        Scanner scanner = new Scanner(System.in);

        // Mensagem para o usuário
        System.out.println("Informe a sua idade: ");
        int age = scanner.nextInt();
        
        scanner.nextLine(); // Para consumir o caractere de nova linha pendente

        System.out.println("Você tem carteira de motorista: S(sim) ou N(não)");
        String driveLicense = scanner.nextLine();

        scanner.close();

        if (age >= 18 && age <= 100 && driveLicense.equalsIgnoreCase("S")) {
            System.out.println("Você pode dirigir.");
        } else {
            System.out.println("Você não pode dirigir.");
        }
    }
}
