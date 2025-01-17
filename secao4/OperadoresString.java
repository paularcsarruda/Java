package secao4;

public class OperadoresString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); // forma correta de comparar Strings
        System.out.println(str1.equalsIgnoreCase(str2)); // java == JAVA -> ignora o case sensitivy

    }
}
