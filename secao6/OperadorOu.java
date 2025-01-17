package secao6;

import java.util.Scanner;

public class OperadorOu {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o seu salário: R$ ");
    double income = scanner.nextDouble();

    System.out.println("Informe o valor da casa que você quer comprar: R$ ");
    double housePrice = scanner.nextDouble();

    if (income <= 300 || housePrice >= 900){
        System.out.println("Desculpe, emprestimo negado.");
    } else{
        System.out.println("Ótimo. Emprestimo aprovado.");
    }

    scanner.close();

    }
}
