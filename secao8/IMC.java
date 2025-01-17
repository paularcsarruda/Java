/*
 * Calculadora IMC
 * Pedir o peso em Kg.
 * Pedir a alura em M.
 * Calcular IMC => peso / (altura * altura).
 * Exibir clssificação:
 * < 18.5 => abaixo do peso
 * >= 18.5 e <= 24.9 => peso normal
 * >= 25 e < 29.9 => sobrepeso
 * mais do que isso => obesidade
 */
package secao8;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu peso em Kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Informe a sua altura ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você no seu peso normal.");
        } else if (imc >= 25 && imc < 29.9){
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está obeso.");
        }

        scanner.close();
    }
}
