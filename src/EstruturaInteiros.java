import java.util.Scanner;

/**
 * Classe que representa uma estrutura de dados para armazenar N números inteiros
 * com métodos recursivos para preenchimento e exibição
 * 
 */
public class EstruturaInteiros {
    
    private int[] numeros;           // Array para armazenar os N números
    private int tamanho;             // Tamanho do array (valor N)
    private Scanner scanner;         // Scanner para leitura de dados
    private AlgoritmoRecursivo algo; // Instância do algoritmo recursivo
    
    /**
     * Construtor da classe EstruturaInteiros
     * @param n Tamanho do array (quantidade de números a serem armazenados)
     */
    public EstruturaInteiros(int n) {
        this.tamanho = n;
        this.numeros = new int[n];
        this.scanner = new Scanner(System.in);
        this.algo = new AlgoritmoRecursivo();
        
        // Inicializa o array com zeros
        for (int i = 0; i < n; i++) {
            numeros[i] = 0;
        }
        
        System.out.println("Estrutura criada com capacidade para " + n + " números.");
    }
    
    /**
     * Método para iniciar o preenchimento recursivo do array
     */
    public void preencherRecursivamente() {
        System.out.println("Iniciando preenchimento recursivo do array...");
        algo.preencherArray(numeros, 0, tamanho, scanner);
    }
    
    /**
     * Método para a exibição recursiva do array
     */
    public void exibirRecursivamente() {
        if (arrayVazio()) {
            System.out.println("Array está vazio. Preencha-o primeiro...");
            return;
        }
        
        System.out.println("Exibindo array recursivamente:");
        System.out.print("[ ");
        algo.exibirArray(numeros, 0, tamanho);
        System.out.println("]");
    }
    
    /**
     * Método para exibir informações da estrutura
     */
    public void exibirInformacoes() {
        System.out.println("\n=== INFORMAÇÕES DA ESTRUTURA ===");
        System.out.println("Tamanho do array: " + tamanho);
        System.out.println("Array vazio: " + (arrayVazio() ? "Sim" : "Não"));
        System.out.println("Conteúdo atual: ");
        
        if (!arrayVazio()) {
            System.out.print("[ ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(numeros[i]);
                if (i < tamanho - 1) System.out.print(", ");
            }
            System.out.println(" ]");
        } else {
            System.out.println("Array ainda não foi preenchido.");
        }
    }
    
    /**
     * Método auxiliar para verificar se o array está vazio
     * @return true se o array estiver vazio, false caso contrário
     */
    private boolean arrayVazio() {
        for (int num : numeros) {
            if (num != 0) return false;
        }
        return true;
    }
    
    // Getters para acesso dos atributos
    public int[] getNumeros() {
        return numeros.clone(); // Retorna uma cópia para proteger o array original
    }
    
    public int getTamanho() {
        return tamanho;
    }
}