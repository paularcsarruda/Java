import java.util.Scanner;

public class MediaAluno {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Mensagem para o usuário
        System.out.println("Informe o nome do aluno: ");
        String name = scanner.nextLine();
       
        System.out.println("Informe a Primeira Nota: ");
        double number1 = scanner.nextDouble();

        System.out.println("Informe a segunda Nota: ");
        double number2 = scanner.nextDouble();

        System.out.println("Informe a terceira Nota: ");
        double number3 = scanner.nextDouble();

        scanner.close();

        double media = (number1 + number2 + number3) / 3;

        // Use printf for formatting the output
        if (media >= 7) {
            System.out.printf("A média final do(a) aluno(a) " + name + " é: %.2f. O(A) Aluno(a) foi APROVADO.\n", media);
        } else {
            System.out.printf("A média final do(a) aluno(a) " + name + " é: %.2f O(A) Aluno(a) foi REPROVADO.\n", media);
        }
    }
}
