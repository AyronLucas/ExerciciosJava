import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o simbolo da operação(*,/,-,+): ");
        String operacao = scanner.next();          

        System.out.print("Digite o primeiro número: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        Double num2 = scanner.nextDouble();

        Double resultado;

        switch (operacao){
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;


            case "/":
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);

            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);

            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);

            default:System.out.println("Lamento, opção inválida!");
        }



    }
}