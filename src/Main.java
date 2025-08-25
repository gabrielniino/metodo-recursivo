import java.util.Scanner;

/**
 * Classe principal que demonstra o uso do algoritmo recursivo
 * para preenchimento e exibição de um array de inteiros
 * 
 * @author Gabriel G. Pereira
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ALGORITMO RECURSIVO PARA MANIPULAÇÃO DE ARRAYS ===");
        System.out.println();

        // Leitura do valor N
        System.out.print("Digite o valor de N (quantidade de números): ");
        int n = scanner.nextInt();

        // Validação do valor de N
        if (n <= 0) {
            System.out.println("Erro: O valor de N deve ser maior que zero!");
            scanner.close();
            return;
        }

        // Criação da estrutura de dados
        EstruturaInteiros estrutura = new EstruturaInteiros(n);

        // Menu de opções
        int opcao;
        do {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("1. Preencher array recursivamente");
            System.out.println("2. Exibir array recursivamente");
            System.out.println("3. Exibir informações da estrutura");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nPreenchendo o array recursivamente...");
                    estrutura.preencherRecursivamente();
                    System.out.println("Array preenchido com sucesso!");
                    break;

                case 2:
                    System.out.println("\nExibindo o array recursivamente:");
                    estrutura.exibirRecursivamente();
                    break;

                case 3:
                    estrutura.exibirInformacoes();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}