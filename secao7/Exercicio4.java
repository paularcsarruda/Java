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

public class Exercicio4 {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro entre 1 - 7: ");
        int weekDay = scanner.nextInt();

        switch (weekDay) {
            case 1:
            case 7:
                System.out.println("Fim de semana.");
                break;
            case 2:
            case 3:  
            case 4: 
            case 5:
            case 6: 
                System.out.println("Dia útil.");
                break;
            
        }
        scanner.close();
    }
}
