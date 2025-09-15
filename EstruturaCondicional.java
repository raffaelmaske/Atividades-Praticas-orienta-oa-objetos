import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            // Menu
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Realizar cálculos (soma de dois números)");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Realizar cálculos
                    System.out.print("Digite o primeiro número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = sc.nextDouble();
                    double soma = num1 + num2;
                    System.out.println("Resultado da soma: " + soma);
                    break;

                case 2:
                    // Cadastrar aluno
                    sc.nextLine(); // limpar buffer
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Aluno " + nome + " cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        sc.close();
    }
}