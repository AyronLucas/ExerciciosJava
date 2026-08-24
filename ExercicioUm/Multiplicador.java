
import java.util.Scanner;

public class Multiplicador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {

            System.out.println("Digite o número: ");
            int num = entrada.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabuada: " + num * i);

            }

        } catch (Exception e) {
            System.out.println("DIgite apenas números inteiros");
        }
    }

}
