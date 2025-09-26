import java.util.Scanner;

public class Algoritmo490 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];
        int l;
        
        for (l = 0; l < 10; l++) {
            System.out.print("digite palavra em letras minusculas " + (l + 1) + ": ");
            nome[l] = scanner.nextLine();
            
            restantes(nome, l, 'c');
        }
        
        for (l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + nome[l]);
        }
        
        System.out.println("\n");
        scanner.close();
    }

    public static int restantes(String[] vet, int indice, char x) {
        String palavraOriginal = vet[indice];
        char[] caracteres = palavraOriginal.toCharArray();
        int cont = 0;
        
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == x) {
                caracteres[i] = '*';
                cont++;
            }
        }
        
        vet[indice] = new String(caracteres);
        
        return cont;
    }
}