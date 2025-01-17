package secao5;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        /*
         * if -> executa um bloco de código se for verdadeiro
         * else -> executa um bloco de código alternativo, se a condição do if for falsa
         * else if -> verfica outra condição se as condições anteriores forem falsas
         * switch -> seleciona e executa um bloco de código entre várias opções com base no valor de uma expressão
         * 
         */

        int x = 10;
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de y: ");
        int y = scanner.nextInt();
        
        //lembrar de fechar o scanner
        scanner.close();

        if (x < y){
            System.out.println("O número digitado é maior que " + x);
        } else {
            System.out.println("O número digitado é menor que " + x);
        }
    }
}
