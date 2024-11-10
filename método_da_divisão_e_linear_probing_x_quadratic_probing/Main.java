/*
Enrico Minto Spainer Tia:10419775
Guilherme Vecchi  Tia:1048517

*/
import java.util.Random;
public class Main{
	 public static void main(String[] args) {
        HashTable tabelaHash = new HashTable();
        Random sc = new Random();

        // Inserir 50 valores na tabela hash
        for (int i = 1; i <= 41; i++) {
            //System.out.println("insira o "+i+" valor:");
            int valor = sc.nextInt(1000);
            tabelaHash.inserirValor(valor);
        }

        // Exibir a tabela hash gerada
        tabelaHash.exibirTabela();

        // Tentar encontrar alguns elementos na tabela
        int[] elementosParaEncontrar = {5, 500, 999, 50}; // Exemplos de elementos a serem encontrados
        for (int elemento : elementosParaEncontrar) {
            boolean encontrado = tabelaHash.encontrarValor(elemento);
            System.out.println("Valor " + elemento + " encontrado: " + encontrado);
        }
        System.exit(0);
    }
}

