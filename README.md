# Algoritmo Recursivo para Manipulação de Arrays em Java

## 📋 Descrição do Projeto

Este projeto implementa um algoritmo de arrays usando métodos recursivos. O sistema permite definir uma estrutura de dados para armazenar N números e manipulá-los através de algoritmos recursivos.

## 🎯 Objetivos

- ✅ Definir uma variável do tipo inteiro capaz de armazenar N números diferentes
- ✅ Implementar método recursivo para preencher todos os espaços da estrutura
- ✅ Implementar método recursivo para exibir os elementos da estrutura
- ✅ Realizar processo completo de depuração com diferentes técnicas

## 📁 Estrutura do Projeto

```
projeto/
├── src/
│   ├── Main.java                    # Classe principal com menu interativo
│   ├── EstruturaInteiros.java       # Classe da estrutura de dados
│   └── AlgoritmoRecursivo.java      # Classe com métodos recursivos
├── docs/
│   └── RelatorioDepuracao.md        # Relatório de depuração
└── README.md                        # Documentação do projeto
```

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE (recomendado: IntelliJ IDEA, Eclipse, ou VS Code)

### Compilação e Execução
```bash
# Compilar os arquivos Java
javac *.java

# Executar o programa principal
java Main
```

## 🔧 Funcionalidades

### 1. Criação da Estrutura
- Define um array de inteiros com tamanho N (definido pelo usuário)
- Inicializa todos os elementos com zero (representando espaços "vazios")
- Valida a entrada do usuário

### 2. Preenchimento Recursivo
```java
public void preencherArray(int[] array, int indice, int tamanho, Scanner scanner) {
    // Caso base: todos elementos preenchidos
    if (indice == tamanho) {
        return;
    }
    
    // Preenche elemento atual
    array[indice] = scanner.nextInt();
    
    // Chamada recursiva para próximo elemento
    preencherArray(array, indice + 1, tamanho, scanner);
}
```

### 3. Exibição Recursiva
```java
public void exibirArray(int[] array, int indice, int tamanho) {
    // Caso base: todos elementos exibidos
    if (indice == tamanho) {
        return;
    }
    
    // Exibe elemento atual
    System.out.print(array[indice]);
    
    // Chamada recursiva para próximo elemento
    exibirArray(array, indice + 1, tamanho);
}
```

## 📊 Exemplo de Execução

```
=== ALGORITMO RECURSIVO PARA MANIPULAÇÃO DE ARRAYS ===

Digite o valor de N (quantidade de números): 3
Estrutura criada com capacidade para 3 números.

=== MENU DE OPÇÕES ===
1. Preencher array recursivamente
2. Exibir array recursivamente
3. Exibir informações da estrutura
0. Sair
Escolha uma opção: 1

Preenchendo o array recursivamente...
Digite o 1º número (posição 0): 10
DEBUG: Preenchido array[0] = 10
Digite o 2º número (posição 1): 20
DEBUG: Preenchido array[1] = 20
Digite o 3º número (posição 2): 30
DEBUG: Preenchido array[2] = 30
Todos os 3 elementos foram preenchidos!
DEBUG: Retornando da posição 2
DEBUG: Retornando da posição 1
DEBUG: Retornando da posição 0
Array preenchido com sucesso!
```

## 🐛 Processo de Depuração

O projeto inclui um relatório detalhado de depuração que documenta:

### STEP OVER
- Execução linha por linha sem entrar em métodos
- Visão do fluxo do programa
- Ideal para testes funcionais

### STEP INTO
- Análise de cada método chamado
- Visualização completa da pilha de recursão
- Compreensão do algoritmo recursivo

### Principais Descobertas
1. **Gestão da Pilha**: Recursão cria múltiplas instâncias do método na pilha
2. **Caso Base Crítico**: Fundamental para evitar Stack Overflow
3. **Unwinding**: Processo de retorno das chamadas recursivas

## 📈 Análise de Complexidade

### Complexidade Temporal
- **Preenchimento**: O(n) - visita cada posição uma vez
- **Exibição**: O(n) - visita cada posição uma vez

### Complexidade Espacial
- **Pilha de Recursão**: O(n) - uma chamada para cada elemento
- **Armazenamento**: O(n) - array de tamanho n

## 🧪 Testes Recomendados

### Casos de Teste Básicos
- N = 1 (caso mínimo)
- N = 5 (caso médio)
- N = 0 (caso inválido)
- N < 0 (caso inválido)

### Casos de Teste de Performance
- N = 1000 (teste de performance)
- N = 10000 (teste de limite da pilha)

### Casos de Teste de Entrada
- Números positivos
- Números negativos
- Zero
- Entrada inválida (letras, símbolos)

## 👨‍💻 Autor

**Nome:** Gabriel G. Pereira
**Curso:** Engenharia de Software
**Instituição:** Centro Universitário Filadélfia  

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais.

---