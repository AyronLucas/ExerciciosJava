
import java.util.Scanner;

public class ConversaoTemp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = entrada.nextInt();
        double conversao = 0;

        do {
            System.out.println("DIGITE O NUMERO DA OPCAO QUE DESEJA: \n"
                    + "[1] - Converter para celsius \n"
                    + "[2] - Converter para fahrenheit \n"
                    + "[3] - Sair");
            switch (opcao) {
                case 1:

                    System.out.println("Digite a temperatura em Celsius: ");
                    double celsius = entrada.nextDouble();

                    conversao = (celsius * 5 / 9) + 32;

                    System.out.println("Resultado: " + conversao);
                    break;

                case 2:
                    System.out.println("Digite a temperatura em fahrenheit:  ");
                    double fahrenheit = entrada.nextDouble();

                    conversao = (fahrenheit - 32) 5 / 9;

                    System.out.println("Resultado: " + conversao);
                    break;

                case 3:
                    System.out.println("Ate a proxima");
                    break;

                default:
                    System.out.println("Opcao Invalida!");
            }

        } while (opcao != 3);

    }

}
