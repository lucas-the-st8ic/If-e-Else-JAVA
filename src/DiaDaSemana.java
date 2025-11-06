import java.util.Scanner;

public class DiaDaSemana {
    static void main() {
        Scanner input = new Scanner(System.in);

        String dia = "";

        System.out.println("Digite o dia da semana: ");
        dia = input.nextLine();
        dia = dia.toLowerCase();

        if(dia.equals("domingo") || dia.equals("sábado")){
            System.out.println(dia + " não é um dia útil.");
        } else  {
            System.out.println(dia + " é um dia útil.");
        }
    }
}
