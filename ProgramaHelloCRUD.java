import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaHelloCRUD {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Visualizar lista de alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    scan.nextLine();
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scan.nextLine();
                    alunos.add(nome);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLista de Alunos:");
                    for (String aluno : alunos) {
                        System.out.println(aluno);
                    }
                    break;
                case 3:
                    System.out.print("Digite o índice do aluno que deseja atualizar: ");
                    int indiceAtualizar = scan.nextInt();
                    scan.nextLine(); 
                    if (indiceAtualizar >= 0 && indiceAtualizar < alunos.size()) {
                        System.out.print("Digite o novo nome do aluno: ");
                        String novoNome = scan.nextLine();
                        alunos.set(indiceAtualizar, novoNome);
                        System.out.println("Aluno atualizado com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 4:
                    System.out.print("Digite o índice do aluno que deseja remover: ");
                    int indiceRemover = scan.nextInt();
                    if (indiceRemover >= 0 && indiceRemover < alunos.size()) {
                        alunos.remove(indiceRemover);
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        
        scan.close();
    }
}
