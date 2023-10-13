public class SobreMim {
    /**
     * @param args the command line arguments (nome, sobrenome, idade, altura)
     * @throws Exception caso ocorra algum erro de execução no programa
     * @autor AlexEduardo-zip
     * @version 1.0
     * @since 2021-03-10
     */
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
    }
}
