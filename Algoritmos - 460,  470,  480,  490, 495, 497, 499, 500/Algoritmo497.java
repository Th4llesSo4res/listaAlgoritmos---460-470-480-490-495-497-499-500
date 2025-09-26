import java.util.Scanner;

public class Algoritmo497 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l, chave, aux;
        int[] num = new int[10];
        
        for (l = 0; l < 10; l++) {
            System.out.print("Digite numero " + (l + 1) + ": ");
            num[l] = scanner.nextInt();
        }
        
        System.out.print("Digite numero de busca: ");
        chave = scanner.nextInt();
        
        ordena(num, 10);
        
        System.out.println("\nVETOR");
        for (l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + num[l]);
        }
        
        int posicao = busca(num, 10, chave);
        
        if (posicao == -1) {
            System.out.println("\nNAO ENCONTRADO");
        } else {
            System.out.println("\nposicao no vetor: " + (posicao + 1));
        }
        
        System.out.println("\n");
        scanner.close();
    }

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0;
        int fim = tam - 1;
        int meio;
        
        while (ini <= fim) {
            meio = (ini + fim) / 2;
            
            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        
        return -1;
    }

    public static void ordena(int[] vet, int tam) {
        int li, ci, aux;
        
        for (li = 0; li < tam - 1; li++) {
            for (ci = li + 1; ci < tam; ci++) {
                if (vet[li] > vet[ci]) {
                    aux = vet[li];
                    vet[li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }
}