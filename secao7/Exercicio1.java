/*
 * Exercício 1: Verificação de Categoria de Preço
 * Peça ao usuário para inserir o valor de um produto.
 * Se o valor for menor que 50, categorize-o como "Barato".
 * Se estiver entre 50 e 100, cotegorize-o como "Médio".
 * Se for maior que 100, categorize-o como " Caro". Exiba a categoria correspondente.
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        Double priceProduct = scanner.nextDouble();

        if (priceProduct < 50){
            System.out.println("O produto está no no seu preço BARATO.");
        } 
        else if (priceProduct >= 50 && priceProduct <= 100){
            System.out.println("O produto está no seu preço MÉDIO.");
        } 
        else{
            System.out.println("O produto está no seu preço CARO.");
        }

        scanner.close();
    }
}
