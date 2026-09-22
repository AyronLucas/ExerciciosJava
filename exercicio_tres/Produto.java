package exercicio_tres;

public class Produto {

    public String nome;
    public int qtde;
    public double preco;

    Produto(String nome, int qtde, double preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade) {
        qtde += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= qtde) {
            qtde -= quantidade;
        } else {
            System.out.println("sem estoque");
        }
    }

    public double calcularValorEstoque() {
        return qtde * preco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + qtde);
        System.out.println("Preço: " + preco);
        System.out.println("Valor do estoque: " + calcularValorEstoque());
    }

    public double valorTotalProdutos() {
        return qtde * preco;
    }
}
