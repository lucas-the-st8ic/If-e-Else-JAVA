import java.util.Scanner;

public class CodigoDeAcesso {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoDeAcesso = 2023;
        int codigoInput = 0;
        int nivelDePermissao = 0;

        System.out.println("Digite o código de acesso: ");
        codigoInput= input.nextInt();

        System.out.println("Digite o nível de permissão: ");
        nivelDePermissao = input.nextInt();

        if (codigoInput == codigoDeAcesso && (nivelDePermissao == 1 || nivelDePermissao == 2 || nivelDePermissao == 3)) {
            System.out.println("Acesso permitido!! \nBem vindo ao sistema!!");
            System.out.println("Nível de Permissão: " + nivelDePermissao);
        } else {
            System.out.println("!!Acesso Negado!!");

            if (codigoInput != codigoDeAcesso) {
                System.out.println("Código de Acesso Incorreto");
            }

            if (nivelDePermissao != 1 || nivelDePermissao != 2 || nivelDePermissao != 3)  {
                System.out.println("Nível de permissão Inválido");
                System.out.println("Níveis de permissão habilitados são 1, 2 ou 3");
            } else{
                System.out.println("Nível de permissão " + nivelDePermissao);
            }
        }
    }
}
