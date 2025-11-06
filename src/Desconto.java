import java.util.Scanner;

public class Desconto {
    static void main() {
        Scanner input = new Scanner(System.in);

        double desconto = 10;
        double valor;
        double valorDoDesconto;
        double valorFinal;

        System.out.println("Digite o valor da compra: R$");
        valor = input.nextDouble();

        if (valor >= 100) {
            valorDoDesconto =((double) desconto /100) * valor;
            valorFinal =  valor - valorDoDesconto;
            System.out.println(valorDoDesconto);

            System.out.println("Desconto de " + desconto + "% aplicado.");
            System.out.println("Valor da compra: R$" + valorFinal);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor da compra: R$" + valor);
        }
    }
}
