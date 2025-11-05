//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);

    int numero = 0;


    System.out.print("Digite um numero: ");
    numero = input.nextInt();

    if (numero % 2 == 0) {
        System.out.println("Par");
    } else  {
        System.out.println("Ímpar");
    }
    }

