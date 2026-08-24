
import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        do {
            try {
                System.out.print("Digite um número (-1 para sair): ");
                numero = entrada.nextInt();

                if (numero == -1) {
                    System.out.println("Programa encerrado!");
                } else if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é PAR.");
                } else {
                    System.out.println("O número " + numero + " é ÍMPAR.");
                }

            } catch (Exception e) {
                System.out.println("Erro! Digite apenas números.");
            }

        } while (numero != -1);
    }
}
