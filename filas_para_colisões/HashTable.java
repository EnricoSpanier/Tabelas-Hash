import java.util.LinkedList;
import java.util.Random;

public class HashTable {
    private static final int TAMANHO_TABELA = 501;
    private LinkedList<Integer>[] tabela;

    @SuppressWarnings("unchecked")
    public HashTable() {
        tabela = new LinkedList[TAMANHO_TABELA];
        for (int i = 0; i < TAMANHO_TABELA; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    // Função hash usando o método da divisão
    private int hashFuncao(int chave) {
        return chave % TAMANHO_TABELA;
    }

    // Inserir valor na tabela hash
    public void inserirValor(int chave) {
        int indice = hashFuncao(chave);
        tabela[indice].add(chave);
    }

    // Exibir a tabela hash
    public void exibirTabela() {
        for (int i = 0; i < TAMANHO_TABELA; i++) {
            System.out.print("Índice " + i + ": ");
            for (int chave : tabela[i]) {
                System.out.print(chave + " -> ");
            }
            System.out.println("null");
        }
    }

    // Encontrar valor na tabela hash
    public boolean encontrarValor(int chave) {
        int indice = hashFuncao(chave);
        return tabela[indice].contains(chave);
    }
}

