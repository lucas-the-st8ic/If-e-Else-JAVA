import java.util.Scanner;

public class LadosTriangulo {
    static void main() {
        Scanner input = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("Digite o valor do primeiro lado:");
        lado1 = input.nextDouble();

        System.out.println("Digite o valor do segundo lado:");
        lado2 = input.nextDouble();

        System.out.println("Digite o valor do terceiro lado:");
        lado3 = input.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo");
        } else {
            System.out.println("Os lados não podem formar um triângulo");
        }
    }
}
