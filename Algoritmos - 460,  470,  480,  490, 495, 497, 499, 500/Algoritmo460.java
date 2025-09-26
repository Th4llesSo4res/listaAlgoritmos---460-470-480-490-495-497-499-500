import java.util.Scanner;

public class Algoritmo460 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a;
        
        for (int c = 0; c < 3; c++) {
            System.out.print("\ndigite numero: ");
            a = scanner.nextInt();
            System.out.println("dobro: " + dob(a));
        }
        
        System.out.println("\n");
        scanner.close();
    }

    public static int dob(int x) {
        return (x * 2);
    }
}