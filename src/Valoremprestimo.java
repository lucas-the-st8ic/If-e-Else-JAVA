import java.util.Scanner;

public class Valoremprestimo {
    static void main() {
        Scanner input = new Scanner(System.in);

        double menorValorEmprestimo = 1000;
        double maiorValorEmprestimo = 5000;
        double valorInput;

        System.out.println("Digite o valor do empréstimo: ");
        valorInput = input.nextDouble();

        if (valorInput < menorValorEmprestimo) {
            System.out.println("Valor abaixo do permitido para empréstimo! \nO valor mínimo é de R$" + menorValorEmprestimo);
        } else if (valorInput > maiorValorEmprestimo) {
            System.out.println("Valor acima do permitido para empréstimo \nO valor máximo é de R$" + maiorValorEmprestimo);
        } else {
            System.out.println("Valor corresponde aos limites de empréstimo!");
        }

    }
}
