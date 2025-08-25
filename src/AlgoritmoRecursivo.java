import java.util.Scanner;

/**
 * Classe contendo os algoritmos recursivos para preenchimento e exibição de arrays
 * 
 * Esta classe implementa os métodos recursivos solicitados no trabalho:
 * - Método recursivo para preencher todos os espaços vazios da estrutura
 * - Método recursivo para exibir os elementos existentes da estrutura
 * 
 */
public class AlgoritmoRecursivo {
    
    /**
     * Método recursivo para preencher um array de inteiros
     * 
     * CASO BASE: Quando o índice atual é igual ao tamanho do array,
     * significa que todos os elementos foram preenchidos.
     * 
     * CASO RECURSIVO: Preenche o elemento atual e chama recursivamente 
     * para o próximo índice.
     * 
     * @param array   O array a ser preenchido
     * @param indice  O índice atual (posição a ser preenchida)
     * @param tamanho O tamanho total do array
     * @param scanner Scanner para leitura dos valores
     */
    public void preencherArray(int[] array, int indice, int tamanho, Scanner scanner) {
        // CASO BASE: Se o índice atual é igual ao tamanho, todos elementos foram preenchidos
        if (indice == tamanho) {
            System.out.println("Todos os " + tamanho + " elementos foram preenchidos!");
            return; // Fim da recursão
        }
        
        // CASO RECURSIVO: Preenche o elemento atual
        System.out.print("Digite o " + (indice + 1) + "º número (posição " + indice + "): ");
        array[indice] = scanner.nextInt();
        
        System.out.println("DEBUG: Preenchido array[" + indice + "] = " + array[indice]);
        
        // CHAMADA RECURSIVA: Chama o método para preencher o próximo elemento
        preencherArray(array, indice + 1, tamanho, scanner);
        
        // Mensagem para visualizar o "unwinding"
        System.out.println("DEBUG: Retornando da posição " + indice);
    }
    
    /**
     * Método recursivo para exibir os elementos de um array
     * 
     * CASO BASE: Quando o índice atual é igual ao tamanho do array,
     * significa que todos os elementos foram exibidos.
     * 
     * CASO RECURSIVO: Exibe o elemento atual e chama recursivamente 
     * para o próximo índice.
     * 
     * @param array   O array a ser exibido
     * @param indice  O índice atual a ser exibido
     * @param tamanho O tamanho total do array
     */
    public void exibirArray(int[] array, int indice, int tamanho) {
        // CASO BASE: Se o índice atual é igual ao tamanho, todos elementos foram exibidos
        if (indice == tamanho) {
            return;
        }
        
        // CASO RECURSIVO: Exibe o elemento atual
        System.out.print(array[indice]);
        
        // Adiciona vírgula e espaço se não for o último elemento
        if (indice < tamanho - 1) {
            System.out.print(", ");
        }
        
        System.out.print("[DEBUG: exibindo posição " + indice + "] ");
        
        // CHAMADA RECURSIVA: Chama o método para exibir o próximo elemento
        exibirArray(array, indice + 1, tamanho);
    }
    
    /**
     * Método recursivo alternativo para exibir array em ordem reversa
     * 
     * @param array   O array a ser exibido
     * @param indice  O índice atual (começando do final)
     */
    public void exibirArrayReverso(int[] array, int indice) {
        // CASO BASE: Se o índice é negativo, todos elementos foram exibidos
        if (indice < 0) {
            return;
        }
        
        // CASO RECURSIVO: Exibe o elemento atual
        System.out.print(array[indice]);
        if (indice > 0) {
            System.out.print(", ");
        }
        
        // CHAMADA RECURSIVA: Chama o método para exibir o elemento anterior
        exibirArrayReverso(array, indice - 1);
    }
    
    /**
     * Método recursivo para calcular a soma dos elementos do array
     * 
     * @param array  O array cujos elementos serão somados
     * @param indice O índice atual
     * @param tamanho O tamanho do array
     * @return A soma dos elementos do array
     */
    public int somarElementos(int[] array, int indice, int tamanho) {
        // CASO BASE: Se chegou ao final do array
        if (indice == tamanho) {
            return 0;
        }
        
        // CASO RECURSIVO: Retorna o elemento atual + a soma do resto
        return array[indice] + somarElementos(array, indice + 1, tamanho);
    }
}