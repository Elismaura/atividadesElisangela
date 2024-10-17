import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + palavra.length() + " dígitos");
        System.out.println("Primeira letra: " + palavra.charAt(0));
        System.out.println("Última letra: " + palavra.charAt(palavra.length() - 1));
        
        if (palavra.length() % 2 != 0) {
            System.out.println("Letra central da palavra: " + palavra.charAt(palavra.length() / 2));
        } else {
            System.out.println("A palavra tem número par de letras, não há letra central exata.");
        }
        
        System.out.println("A palavra escrita ao contrário é: " + new StringBuilder(palavra).reverse().toString());
        System.out.println("A palavra toda em maiúsculo: " + palavra.toUpperCase());
        System.out.println("A palavra toda em minúsculo: " + palavra.toLowerCase());
        
        scanner.close();
    }
}
