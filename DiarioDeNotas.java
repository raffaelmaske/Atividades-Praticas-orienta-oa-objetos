import java.util.Scanner;

public class DiarioDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota");
        double nota = sc.nextDouble();

        if (nota >= 6){
            System.out.println("Aprovado com a nota "+nota);
        }else if (nota >= 4 && nota <= 5.9){
            System.out.println("Recuperação com a nota "+nota);
        }else{
            System.out.println("Reprovado com a nota "+nota);
        }
    }
}
