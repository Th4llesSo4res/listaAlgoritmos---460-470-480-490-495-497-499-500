import java.util.Scanner;

public class Algoritmo470 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, pri;
        
        System.out.print("\ndigite um numero >0: ");
        num = scanner.nextInt();
        
        pri = primo(num);
        
        if (pri == 0) {
            System.out.println("\n" + num + " e primo");
        } else {
            System.out.println("\n" + num + " nao e primo");
        }
        
        System.out.println("\n");
        scanner.close();
    }

    public static int primo(int n) {
        if (n <= 1) {
            return 1;
        }

        int c = 0;
        int p = 2;

        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }
        
        return c;
    }
}