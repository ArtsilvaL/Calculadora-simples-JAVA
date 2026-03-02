import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a Calculadora JAVA de dois números\n");
        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        int loop = 1;
        while (loop == 1) {
            System.out.println("\n Selecione a operação:\n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Selecione outros números \n6 - Fechar programa");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("O resultado da Adição é " + (n1 + n2));
                    break;

                case 2:
                    System.out.println("O resultado da Subtração é " + (n1 - n2));
                    break;

                case 3:
                    System.out.println("O resultado da Multiplicação é " + (n1 * n2));
                    break;

                case 4:
                    System.out.println("O resultado da Divisão é " + (n1 / n2));
                    break;

                case 5:
                    System.out.println("Digte o primeiro número: ");
                    n1 = scanner.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    break;

                case 6:
                    System.out.println("Encerrando o Programa");
                    loop++;
            }
        }
    }
}
