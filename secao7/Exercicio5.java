/*
 * Exercício 5: Identificação de dia útil
 * 
 * Peça ao usuário para unserir um número de 1-7,
 * respresentando os dias da semana.
 * Use switch para verificar se o dia é um dia útil (segunda a sexta)
 * ou final de semana (sábado e domengo).
 * Exiba uma mensagem correspondente.
 */

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro entre 1 - 7: ");
        int weekDay = scanner.nextInt();

        switch (weekDay) {
            case 1:
                System.out.println("Domingo. Fim de semana.");
                break;
            case 2:
                System.out.println("Segunda-Feira. Dia útil.");
                break;
            case 3:
                System.out.println("Terça-Feira. Dia útil.");
                break;
            case 4: 
                System.out.println("Quarta-Feira. Dia útil.");
                break;
            case 5:
                System.out.println("Quinta-Feira. Dia útil.");
                break;
            case 6: 
                System.out.println("Sexta-Feira. Dia útil.");
                break;
            case 7:
                System.out.println("Sábado. Fim de semana.");
                break;
        }
        scanner.close();
    }
}
