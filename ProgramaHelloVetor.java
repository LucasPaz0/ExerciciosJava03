import java.util.Scanner;

public class ProgramaHelloVetor {
    public static void main(String[] args) {
        int tamanhoVetor = 5;
        int[] vetor = new int[tamanhoVetor];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scan.nextInt();
        }
        
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }
        scan.close();
    }
}