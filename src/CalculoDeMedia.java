import java.util.Scanner;

public class CalculoDeMedia {
    static void main() {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media: " + media);

        if (media >= 7) {
            System.out.println("O estudante teve média de " + media + " e foi aprovado.");
        } else if (media >= 5 && media <= 6.90) {
            System.out.println("O estudante teve média de " + media + " e está de recuperação.");
        } else if (media <= 4.3) {
            System.out.println("O estudante teve média de " + media + " e foi reprovado.");
        }
    }
}
