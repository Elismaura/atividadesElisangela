import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("O número é " + (numero % 2 == 0 ? "par" : "ímpar"));
        System.out.println("O número é " + (numero >= 0 ? "positivo" : "negativo"));
        System.out.println("O número é " + (isPrimo(numero) ? "primo" : "não é primo"));
        System.out.println("A raiz quadrada do número: " + Math.sqrt(numero));
        System.out.println("O número elevado a 3: " + Math.pow(numero, 3));
        
        scanner.close();
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
