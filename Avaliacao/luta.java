
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class luta {

    static int codigoInicio = 0;

    public static int codigoRobo() {
        codigoInicio++;
        return codigoInicio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Robo> robos = new ArrayList<>();

        int opcao = -1;

        do {
            System.out.println("==== Combate de Robos ====");
            System.out.println("0. Sair");
            System.out.println("1. Cadastrar Robo");
            System.out.println("2. Consultar um Robo");
            System.out.println("3. Consultar todos Robos");
            System.out.println("4. Realizar Combate");
            System.out.println("5. Recuperar Energia");
            System.out.println("6. Rodada Geral");
            System.out.println("7. Classificação");
            System.out.println("8. Estatisticas");
            System.out.println("9. Excluir Robo");
            System.out.println("Digite a operação: ");

            opcao = buscarOperacao(scanner);

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    int codigo = codigoRobo();
                    System.out.println("Codigo Robo: " + codigo);
                    System.out.println("Digite o nome do robo: ");
                    String nome = scanner.next();

                    if (nome.trim().isEmpty()) {
                        System.out.println("O nome nao pode estar vazio.");
                        System.out.println("Digite novamente: ");
                        nome = scanner.next();
                    }

                    System.out.println("Digite em quantidade a forca do robo: ");
                    int ataque = scanner.nextInt();
                    if (ataque < 10 || ataque > 30) {
                        System.out.println("Ataque deve ser entre 10 a 30");
                        System.out.println("Digite novamente: ");
                        ataque = scanner.nextInt();
                    }

                    System.out.println("Digite em quantidade a defesa do robo: ");
                    int defesa = scanner.nextInt();
                    if (defesa < 0 || defesa > 20) {
                        System.out.println("Defesa deve ser entre 0 a 20");
                        System.out.println("Digite novamente: ");
                        ataque = scanner.nextInt();
                    }

                    Robo robo = new Robo(
                            codigo,
                            nome,
                            ataque,
                            defesa
                    );

                    robos.add(robo);
                    break;

                case 2:
                    System.out.println("Digite o codigo do robo: ");
                    int codigoConsulta = scanner.nextInt();

                    for (Robo consultaRobo : robos) {

                        if (consultaRobo.codigo == codigoConsulta) {

                            System.out.println("Codigo: " + consultaRobo.codigo);
                            System.out.println("Nome: " + consultaRobo.nome);
                            System.out.println("Ataque: " + consultaRobo.ataque);
                            System.out.println("Defesa: " + consultaRobo.defesa);
                            System.out.println("Energia: " + consultaRobo.energiaAtual);
                            System.out.println("Vitorias: " + consultaRobo.vitorias);
                            System.out.println("Derrotas: " + consultaRobo.derrotas);
                            System.out.println("Pontos: " + consultaRobo.pontos);

                            if (consultaRobo.energiaAtual >= 30) {
                                System.out.println("Situacao: Disponivel");
                            } else {
                                System.out.println("Situacao: Em recuperacao");
                            }

                        }
                    }
                    break;

                case 3:
                    for (Robo r : robos) {
                        System.out.println("Codigo: " + r.codigo);
                        System.out.println("Nome: " + r.nome);
                        System.out.println("Ataque: " + r.ataque);
                        System.out.println("Defesa: " + r.defesa);
                        System.out.println("Energia: " + r.energiaAtual);
                        System.out.println("Vitorias: " + r.vitorias);
                        System.out.println("Derrotas: " + r.derrotas);
                        System.out.println("Pontos: " + r.pontos);

                    }
                    break;

                case 4:

                    System.out.println("Digite o codigo do primeiro robo: ");
                    int codigo1 = scanner.nextInt();

                    System.out.println("Digite o codigo do segundo robo: ");
                    int codigo2 = scanner.nextInt();

                    Robo robo1 = null;
                    Robo robo2 = null;

                    for (Robo lutaRobo : robos) {

                        if (lutaRobo.codigo == codigo1) {
                            robo1 = lutaRobo;
                        }

                        if (lutaRobo.codigo == codigo2) {
                            robo2 = lutaRobo;
                        }
                    }

                    if (robo1 == null || robo2 == null) {
                        System.out.println("Um ou os dois robos nao foram encontrados.");
                        break;
                    }

                    if (robo1.codigo == robo2.codigo) {
                        System.out.println("Os robos devem ser diferentes.");
                        break;
                    }

                    if (robo1.energiaAtual < 30 || robo2.energiaAtual < 30) {
                        System.out.println("Os dois robos precisam ter pelo menos 30 de energia.");
                        break;
                    }

                    Robo primeiro;
                    Robo segundo;
                    if (robo1.pontos < robo2.pontos) {
                        primeiro = robo1;
                        segundo = robo2;
                    } else if (robo2.pontos < robo1.pontos) {
                        primeiro = robo2;
                        segundo = robo1;
                    } else if (robo1.codigo < robo2.codigo) {
                        primeiro = robo1;
                        segundo = robo2;
                    } else {
                        primeiro = robo2;
                        segundo = robo1;
                    }

                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Rodada: " + i);
                        int dano = primeiro.ataque - segundo.defesa;
                        if (dano < 5) {
                            dano = 5;
                        }

                        segundo.receberDano(dano);
                    }
            }

        } while (opcao != 0);
    }

    public static int buscarOperacao(Scanner scanner) {

        int opcao = -1;

        do {

            try {

                opcao = scanner.nextInt();

            } catch (InputMismatchException e) {

                scanner.next();

                System.out.println("Operação inválida");
                System.out.println("Digite novamente a informação!");

                opcao = -1;
            }
        } while (opcao < 0);
        return opcao;
    }
}
