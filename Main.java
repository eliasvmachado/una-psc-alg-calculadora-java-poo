import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calcula = new Calculadora();

        char opcao;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Raiz Quadrada");
            System.out.println("Q. Sair");

            opcao = scanner.next().charAt(0);

            if (opcao == 'Q' || opcao == 'q') {
                System.out.println("Encerrando o programa...");
                break;
            }

            double resultado;
            double num1, num2;

            switch (opcao) {
                case '1':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    resultado = calcula.adicao(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case '2':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    resultado = calcula.subtracao(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case '3':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    resultado = calcula.multiplicacao(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case '4':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    resultado = calcula.divisao(num1, num2);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                case '5':
                    System.out.println("Digite o número base:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o expoente:");
                    num2 = scanner.nextDouble();
                    resultado = calcula.potencia(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case '6':
                    System.out.println("Digite o número:");
                    num1 = scanner.nextDouble();
                    resultado = calcula.raizQuadrada(num1);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        } while (opcao != 'Q' && opcao != 'q');

        scanner.close();
    }
}
