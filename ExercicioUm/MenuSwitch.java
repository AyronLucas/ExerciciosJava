
import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = entrada.nextInt();
        double area = 0;
        do {
            System.out.println("DIGITE O NUMERO DA OPCAO QUE DESEJA: \n"
                    + "[1] - calcular area de um quadrado \n"
                    + "[2] - Calcular área de um círculo \n"
                    + "[3] - Calcular perímetro de um retângulo \n"
                    + "[4] - Sair");
            switch (opcao) {
                case 1:

                    System.out.println("Digite o mumero do 1° lado: ");
                    double lado1 = entrada.nextDouble();

                    area = lado1 * lado1;

                    System.out.println("Resultado: " + area);
                    break;

                case 2:
                    System.out.println("Digite o raio do circulo: ");
                    double raio = entrada.nextDouble();

                    area = 3.14 * (raio * raio);

                    System.out.println("Resultado: " + area);
                    break;

                case 3:
                    System.out.println("Digite o comprimento: ");
                    double comp = entrada.nextDouble();

                    System.out.println("Digite a largura: ");
                    double larg = entrada.nextDouble();

                    area = 2 * (comp * larg);

                    System.out.println("Resultado: " + area);
                    break;

                case 4:
                    System.out.println("Ate a proxima");
                    break;

                default:
                    System.out.println("Opcao Invalida!");
            }

        } while (opcao != 4);

    }
}
