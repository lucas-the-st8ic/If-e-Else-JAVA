import java.util.Scanner;

public class DoacaoDeSangue {
    static void main() {
        Scanner input = new Scanner(System.in);

        int idade, idadeMinima = 17, idadeMaxima = 65;
        int peso, pesoMinimo = 50;

        System.out.println("Digite a idade do doador: ");
        idade = input.nextInt();

        System.out.println("Digite o peso do doador(em KG): ");
        peso = input.nextInt();

        if (idade > idadeMinima && idade < idadeMaxima && peso > pesoMinimo) {
            System.out.println("Doador compatível com os requisitos.");
        } else if (idade < idadeMinima && idade > idadeMaxima && peso < pesoMinimo) {
            System.out.println("Doador incompatível!!\nIdade mínima precisa estar entre" +idadeMinima+ " e " +idadeMaxima+ " anos.");
            System.out.println("E o doador precisa pesar mais do que " +pesoMinimo+ " Kilos.");
        }

    }
}
