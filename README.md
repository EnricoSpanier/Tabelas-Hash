# Tabelas Hash em Java

> **English:** Java study project comparing hash functions (division vs multiplication) and collision-handling strategies (linear probing, quadratic probing and separate chaining) on small hash tables, counting collisions along the way.

Projeto acadêmico em Java com implementações de tabela hash de inteiros. Cada pasta é uma variação independente (com sua própria `HashTable`), para comparar como a função hash e o tratamento de colisões afetam o número de colisões.

## Variações

| Pasta | Função hash | Tratamento de colisões | Tamanho da tabela |
| --- | --- | --- | --- |
| `método_da_divisão_e_linear_probing` | Divisão (`chave % m`) | Sondagem linear | 41 |
| `método_da_divisão_e_linear_probing_x_quadratic_probing` | Divisão (`chave % m`) | Sondagem linear, com a sondagem quadrática (`i*i`) pronta para alternar no código | 41 |
| `método_da_multiplicação_e_linear_probing` | Multiplicação (constante 0,7) | Sondagem linear | 31 |
| `filas_para_colisões` | Divisão (`chave % m`) | Encadeamento (`LinkedList` por posição) | 501 |

## O que cada `HashTable` oferece

- `inserirValor(chave)`: insere um inteiro na tabela;
- `encontrarValor(chave)`: busca um inteiro;
- `exibirTabela()`: imprime o conteúdo de cada posição e, nas versões de endereçamento aberto, a quantidade de colisões ocorridas.

Nas variações com sondagem, o contador `colisoes` é incrementado a cada posição ocupada encontrada durante a inserção, o que permite comparar as estratégias com a mesma carga de dados.

## Como executar

Requisito: JDK instalado. Em cada pasta que contém um `Main.java`:

```bash
cd "filas_para_colisões"
javac *.java
java Main
```

O `Main` insere valores aleatórios (`java.util.Random`), exibe a tabela e testa algumas buscas. A pasta `método_da_multiplicação_e_linear_probing` contém apenas a classe `HashTable`, sem programa principal.

## Autores

Enrico Spanier e Guilherme Vecchi ([@endydragonn](https://github.com/endydragonn)).
