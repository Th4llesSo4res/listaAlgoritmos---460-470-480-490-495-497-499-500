import java.util.Scanner;

public class Algoritmo495 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[5];
        int l;
        
        for (l = 0; l < 5; l++) {
            System.out.print("Digite nome " + (l + 1) + ": ");
            nome[l] = scanner.nextLine();
        }
        
        ordena(nome, 5);
        
        System.out.println("\n\nNOMES ORDENADOS\n");
        
        for (l = 0; l < 5; l++) {
            System.out.println((l + 1) + " - " + nome[l]);
        }
        
        System.out.println(" \n ");
        scanner.close();
    }

    public static void ordena(String[] vet, int tam) {
        int li, ci;
        String aux;
        
        // Laço externo: Li
        for (li = 0; li < tam - 1; li++) {
            // Laço interno: Ci
            for (ci = li + 1; ci < tam; ci++) {
                // Compara as Strings e verifica se 'vet[li]' é lexicograficamente maior que 'vet[ci]'
                // compareTo() retorna um valor > 0 se a primeira String for maior
                if (vet[li].compareTo(vet[ci]) > 0) {
                    // Troca (Swap)
                    aux = vet[li];
                    vet[li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }
}