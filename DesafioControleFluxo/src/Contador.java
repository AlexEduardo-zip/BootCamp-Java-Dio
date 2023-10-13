import java.util.Scanner;

/**
 * Classe que recebe dois parâmetros inteiros e imprime todos os números entre
 * eles
 * 
 * @autor: AlexEduardo-zip
 * @version 1.0
 * @since 2021-03-01
 */
public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        // try-catch
        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            // capturando a exceção do tipo ParametrosInvalidosException
        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();

    }

    /**
     * Método que recebe dois parâmetros inteiros e imprime todos os números entre
     * eles
     * 
     * @param parametroUm
     * @param parametroDois
     * @throws ParametrosInvalidosException
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            // lançar uma exceção do tipo ParametrosInvalidosException
            throw new ParametrosInvalidosException();
        }

        // imprimir todos os números entre os parâmetros
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
