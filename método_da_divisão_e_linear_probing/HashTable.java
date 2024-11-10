public class HashTable {

    private static final int TAMANHO_TABELA = 51; // Tamanho da tabela hash
    private Integer[] tabela; // Tabela hash

    public HashTable() {
        tabela = new Integer[TAMANHO_TABELA];
    }

    // Função hash usando o método da divisão
    private int hashFuncao(int chave) {
        return chave % TAMANHO_TABELA;
    }

    // Inserir valor na tabela hash
    public void inserirValor(int chave) {
        int indice = hashFuncao(chave);
        while (tabela[indice] != null) {
            // Tratamento linear de colisões
            indice = (indice + 1) % TAMANHO_TABELA;
        }
        tabela[indice] = chave;
    }

    // Exibir a tabela hash
    public void exibirTabela() {
        for (int i = 0; i < TAMANHO_TABELA; i++) {
            System.out.println("Índice " + i + ": " + tabela[i]);
        }
    }

    // Encontrar valor na tabela hash
    public boolean encontrarValor(int chave) {
        int indice = hashFuncao(chave);
        while (tabela[indice] != null) {
            if (tabela[indice].equals(chave)) {
                return true;
            }
            indice = (indice + 1) % TAMANHO_TABELA;
        }
        return false;
    }

}
