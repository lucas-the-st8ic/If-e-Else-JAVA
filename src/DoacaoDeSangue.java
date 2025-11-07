import java.util.Scanner;

public class DoacaoDeSangue {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int idade, idadeMinima = 18, idadeMaxima = 65;
        int peso, pesoMinimo = 50;

        System.out.println("Digite a idade do doador: ");
        idade = input.nextInt();

        System.out.println("Digite o peso do doador(em KG): ");
        peso = input.nextInt();

        if (idade >= idadeMinima && idade <= idadeMaxima && peso > pesoMinimo) {
            System.out.println("Doador compatível com os requisitos.");
        } else {
            System.out.println("Doador incompatível com os requisitos.");

            if(idade < idadeMinima || idade > idadeMaxima){
                System.out.println("A idade precisa estar entre " + idadeMinima + " e " + idadeMaxima + " anos.");

            }

            if (peso <= pesoMinimo) {
                System.out.println("O peso mínimo para doação é de " +pesoMinimo+ " Kilos.");
            }
        }
    }
}
