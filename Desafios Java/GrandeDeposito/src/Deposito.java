import java.util.Scanner;

public class Deposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            // TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide
            // Exemplos).
            System.out.println("Depósito realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f", valor);
        } else if (valor < 0) {
            // TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Valor inválido! Digite um valor maior que zero.");
        } else if (valor == 0) {
            // TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Encerrando o programa...");
        }
        scanner.close();
    }
}