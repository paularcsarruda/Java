/*
 * Exercício 5: Verificação de Intervalo com AND
 * Peça ao usuário para inserir um número.
 * Verifique se o número está no intervalo de 10 - 20, inclusive.
 * Se estiver, exiba "Dentro do Intervalo". Caso contrário, exiba "Fora do Intervalo".
 */

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <=20){
            System.out.println("Dentro do Intervalo.");
        } else {
            System.out.println("Fora do Intervalo.");
        }

        scanner.close();
    }
}
