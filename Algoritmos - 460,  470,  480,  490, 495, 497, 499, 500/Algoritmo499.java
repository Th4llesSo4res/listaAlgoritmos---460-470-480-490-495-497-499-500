import java.util.Scanner;

public class Algoritmo499 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op, l, flag = 0;
        int[] num = new int[5];

        do {
            System.out.println("\nMENU VETOR - FUNCAO");
            System.out.println("1 Dados do VETOR");
            System.out.println("2 Ordena VETOR");
            System.out.println("3 Imprime VETOR");
            System.out.println("4 Sai do programa");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    num = entrada(num, 5, scanner);
                    flag = 1;
                    break;

                case 2:
                    if (flag == 1) {
                        num = ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;

                case 3:
                    if (flag == 1) {
                        imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;

                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;

                default:
                    System.out.println("\nOpcao Invalida");
                    break;
            }
        } while (op != 4);

        System.out.println("\n");
        scanner.close();
    }

    public static int[] entrada(int[] vet, int t, Scanner scanner) {
        System.out.println("\nEntrada do VETOR");
        
        // Consome a quebra de linha pendente após nextInt/nextDouble
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        for (int l = 0; l < t; l++) {
            System.out.print("Digite numero " + (l + 1) + ": ");
            vet[l] = scanner.nextInt();
        }
        
        return vet;
    }

    public static void imprime(int[] vet, int t) {
        System.out.println("\nVETOR");
        for (int l = 0; l < t; l++) {
            System.out.println((l + 1) + " - " + vet[l]);
        }
    }

    public static int[] ordena(int[] vet, int tam) {
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
        return vet;
    }
}