import java.util.Arrays;
import java.util.Scanner;

public class ProgramaOrdenacao {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scan.nextInt();
        }
        
        Arrays.sort(vetor);
        
        System.out.println("Elementos do vetor em ordem crescente:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }
        
        scan.close();
    }
}
