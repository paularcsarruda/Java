/*
 * Exercício 6: Classificação de Letra
 * Peça ao usuário para inserir uma letra.
 * Verifique se a letra é uma vogal ou uma consoante.
 * Exiba "Vogal" ou "Consoante" de acordo com a entrada.
 * Considere tanto letras maúsculas quanto minúsculas.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra do alfabeto: ");
        String letter = scanner.nextLine();

        if (letter.length() == 1 && (letter.equalsIgnoreCase("a") || 
                                     letter.equalsIgnoreCase("e") || 
                                     letter.equalsIgnoreCase("i") || 
                                     letter.equalsIgnoreCase("o") || 
                                     letter.equalsIgnoreCase("u"))) {
            System.out.println("Vogal.");
        } else{
            System.out.println("Consoante.");
        }
        scanner.close();
    }
}
