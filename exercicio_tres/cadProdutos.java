package exercicio_tres;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class cadProdutos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opt = -1;

        do {

            System.out.println("==== Produtos ====");
            System.out.println("0. Sair");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Somar Preço dos Produtos");
            System.out.println("4. Excluir Produto");
            System.out.println("Digite a operação: ");

            opt = buscarOperacao(scanner);

            switch (opt) {

                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.next();

                    System.out.println("Digite a quantidade do produto: ");
                    int qtde = scanner.nextInt();

                    System.out.println("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(
                            nome,
                            qtde,
                            preco
                    );

                    produtos.add(produto);
                    break;

                case 2:
                    System.out.println("Digite o nome do produto que deseja vender: ");
                    String produtoVenda = scanner.next();

                    System.out.println("Digite a quantidade que deseja vender: ");
                    int quantidadeVenda = scanner.nextInt();

                    for (Produto produtoVendaAtual : produtos) {

                        if (produtoVendaAtual.nome.equals(produtoVenda)) {

                            if (produtoVendaAtual.qtde >= quantidadeVenda) {

                                produtoVendaAtual.qtde -= quantidadeVenda;

                                System.out.println("Retirado");
                                System.out.println("Estoque restante: "
                                        + produtoVendaAtual.qtde);

                            } else {
                                System.out.println("Estoque insuficiente!");
                            }
                        }
                    }
                    break;

                case 3:
                    double valorTotalProdutos = 0;

                    for (Produto produtoAtual : produtos) {

                        System.out.println("Nome: " + produtoAtual.nome);
                        System.out.println("Quantidade: " + produtoAtual.qtde);
                        System.out.println("Preço: " + produtoAtual.preco);

                        valorTotalProdutos += produtoAtual.calcularValorEstoque();
                    }

                    System.out.println("Valor total do estoque: "
                            + valorTotalProdutos);

                    break;

                case 4:
                    System.out.println("Digite o nome do produto que deseja excluir: ");
                    String produtoExcluir = scanner.next();

                    for (int i = 0; i < produtos.size(); i++) {

                        if (produtos.get(i).nome.equals(produtoExcluir)) {

                            produtos.remove(i);

                            System.out.println("Produto excluído do sistema!");
                            break;
                        }
                    }
                    break;
            }

        } while (opt != 0);

        scanner.close();
    }

    public static int buscarOperacao(Scanner scanner) {

        int opt = -1;

        do {

            try {

                opt = scanner.nextInt();

            } catch (InputMismatchException e) {

                scanner.next();

                System.out.println("Operação inválida");
                System.out.println("Digite novamente a informação!");

                opt = -1;
            }

        } while (opt < 0);

        return opt;
    }
}
