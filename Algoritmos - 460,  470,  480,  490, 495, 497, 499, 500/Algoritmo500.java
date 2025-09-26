import java.util.Scanner;

public class Algoritmo500 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op, l;
        int flagA = 0; // flag para o VETOR A
        int flagB = 0; // flag para o VETOR B
        int[] numA = new int[5];
        int[] numB = new int[5];

        do {
            System.out.println("\nVETORES");
            System.out.println("1 Dados do VETOR A");
            System.out.println("2 Dados do VETOR B");
            System.out.println("3 Imprime VETORES");
            System.out.println("4 Soma VETORES");
            System.out.println("5 Subtrai VETORES");
            System.out.println("6 Sai do programa");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    numA = entrada(numA, 5, "A", scanner);
                    flagA = 1;
                    break;

                case 2:
                    numB = entrada(numB, 5, "B", scanner);
                    flagB = 1;
                    break;

                case 3:
                    if (flagA == 1 && flagB == 1) {
                        imprime(numA, 5, "A");
                        imprime(numB, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;

                case 4:
                    if (flagA == 1 && flagB == 1) {
                        soma(numA, numB, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;

                case 5:
                    if (flagA == 1 && flagB == 1) {
                        subtrai(numA, numB, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;

                case 6:
                    System.out.println("\nSaindo do Algoritmo");
                    break;

                default:
                    System.out.println("\nOpcao Invalida");
                    break;
            }
        } while (op != 6);

        System.out.println("\n");
        scanner.close();
    }

    // Função que recebe o vetor, tamanho, tipo (A ou B) e o Scanner
    public static int[] entrada(int[] vet, int t, String c, Scanner scanner) {
        System.out.println("\nEntrada do VETOR " + c);
        
        // Consome a quebra de linha pendente
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        for (int l = 0; l < t; l++) {
            System.out.print("Digite numero " + (l + 1) + ": ");
            vet[l] = scanner.nextInt();
        }
        
        return vet;
    }

    // Função que imprime o vetor
    public static void imprime(int[] vet, int t, String c) {
        System.out.println("\nVETOR " + c);
        for (int l = 0; l < t; l++) {
            System.out.println(vet[l]);
        }
    }

    // Função que calcula e imprime a soma
    public static void soma(int[] vet, int[] vet1, int t) {
        int s;
        System.out.println("\nSOMA");
        for (int l = 0; l < t; l++) {
            s = vet[l] + vet1[l];
            System.out.println(s);
        }
    }

    // Função que calcula e imprime a subtração
    public static void subtrai(int[] vet, int[] vet1, int t) {
        int d;
        System.out.println("\nDIFERENCA");
        for (int l = 0; l < t; l++) {
            d = vet[l] - vet1[l];
            System.out.println(d);
        }
    }
}