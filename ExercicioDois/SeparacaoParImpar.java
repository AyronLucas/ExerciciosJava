import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class SeparacaoParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];

        int qtdePares = 0;
        int qtdeImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[qtdePares] = numeros[i];
                System.out.println("Pares: "+ pares[i]);

            } else {
            }
        }
    }
}