
import java.util.Scanner;

public class SomaWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer num1;
        Integer soma = 0;

        try {

            do {
                System.out.println("Digite um número: ");
                num1 = entrada.nextInt();

                soma += num1;

            } while (num1 != 0);
            {
                System.out.println("A soma é: " + soma);
            }

        } catch (Exception e) {
            System.out.println("Digite só números inteiros!");
        }
    }
}
