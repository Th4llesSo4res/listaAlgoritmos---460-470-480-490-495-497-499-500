import java.util.Scanner;

public class Algoritmo480 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        
        System.out.print("\ndigite numero: ");
        n = scanner.nextInt();
        
        x = reverso(n);
        
        System.out.println(" \n " + n + " - " + x);
        
        if (x == n) {
            System.out.println("\nE un numero capicua");
        } else {
            System.out.println("\nNao e um numero capicua");
        }
        
        System.out.println("\n");
        scanner.close();
    }

    public static int reverso(int num) {
        int soma = 0;
        int r;
        
        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        
        return soma;
    }
}