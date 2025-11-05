import java.util.Scanner;

public class Senha {
    static void main() {
        Scanner input = new Scanner(System.in);

        int senha;

        System.out.println("Digite seu senha: ");
        senha = input.nextInt();

        if (senha == 123456) {
            System.out.println("Acesso permitido!!");
        } else  {
            System.out.println("Senha incorreta! \nAcesso negado!");
        }
    }
}
