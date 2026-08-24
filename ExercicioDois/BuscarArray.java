import java.util.Scanner;

public class BuscarArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        try {

            // Preenchendo o array
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros[i] = scanner.nextInt();
            }

            // Número que será procurado
            System.out.print("Digite o número que deseja procurar: ");
            int busca = scanner.nextInt();

            boolean encontrado = false;

            // Procurando o número no array
            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] == busca) {
                    System.out.println("Número encontrado na posição: " + i);
                    encontrado = true;
                }
            }

            // Verifica se encontrou
            if (encontrado) {
                System.out.println("O número está presente no array.");
            } else {
                System.out.println("O número não foi localizado.");
            }

        } catch (Exception e) {
            System.out.println("Valor inválido! Digite apenas números inteiros.");
        }

    }
}