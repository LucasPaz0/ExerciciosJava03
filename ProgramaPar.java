import java.util.Scanner;

public class ProgramaPar {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scan.nextInt();
        }
        
        System.out.println("Números pares:");
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
        
        scan.close();
    }
}
