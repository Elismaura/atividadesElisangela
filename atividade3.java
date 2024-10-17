import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();
        System.out.print("Digite o valor do desconto: ");
        double desconto = scanner.nextDouble();

        double valorNovo = valorCheio - desconto;
        
        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("O valor novo é: " + valorNovo);
        
        scanner.close();
    }
}
