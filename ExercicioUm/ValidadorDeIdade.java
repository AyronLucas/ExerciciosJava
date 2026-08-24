
import java.util.Scanner;

public class ValidadorDeIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Digite sua idade: ");
            Integer idade = scanner.nextInt();

            if (idade >= 60) {
                System.out.println("Você é idoso! cuidado...");

            } else if (idade >= 18 && idade < 60) {
                System.out.println("Adulto");
            } else {
                System.out.println("Você é dimenor");
            }

        } catch (Exception e) {
            System.out.println("Idade invalida, digite apenas números inteiros");
        }
    }
}
