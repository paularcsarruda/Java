/*
 * Exercício 3: Identificação de Paridade com Strings
 * 
 * Peça ao usuário para inserir um número.
 * Verifique se o número é par ou ímpar e exiba a informação.
 * Use uma string para armazenar o resulado e exibi-la.
 */

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro entre 1 - 10: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Número Impar.");
                break;
            case 2:
                System.out.println("Número Par.");
                break;
            case 3:
                System.out.println("Número Impar.");
                break;
            case 4:
                System.out.println("Número Par.");
                break;
            case 5:
                System.out.println("Número Impar.");
                break;
            case 6:
                System.out.println("Número Pa.r");
                break;
            case 7:
                System.out.println("Número Impar.");
                break;
            case 8:
                System.out.println("Número Par.");
                break;
            case 9:
                System.out.println("Número Impar.");
                break;
            case 10:
                System.out.println("Número Par.");
                break;
        }
        scanner.close();

    }
}
