/*
 * Exercício 2: Validação de Login
 * Peça ao usuário para inserir um nome de usuário e uma senha.
 * Verifique se o nome de usuário é "admin" e a senha é "1234".
 * Se ambos forem corretos, exiba "Acesso Permitido".
 * Caso contrário, exiba "Acesso Negado".
 */

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o seu nome de usuário: ");
        String userName = scanner.nextLine();

        System.out.print("Digite a sua senha senha: ");
        int password = scanner.nextInt();

        scanner.close();

        // Usando o método equals() para comparar o conteúdo da string
        if(userName.equals("admin") && password == 1234){
            System.out.println("Acesso Permitido.");
        } else {
            System.out.println("Acesso Negado.");
        }

    }
}
