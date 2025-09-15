import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[3][2]; // 3 alunos x 2 provas
        double[] medias = new double[3]; // média de cada aluno

        // Entrada de dados
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Prova " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Cálculo das médias
        for (int i = 0; i < 3; i++) {
            double soma = 0;
            for (int j = 0; j < 2; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 2.0;
        }

        // Saída de dados
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        sc.close();
    }
}