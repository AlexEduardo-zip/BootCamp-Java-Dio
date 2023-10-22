package main.java.list.Ordenacao;

public class Pessoa {
    // atributos
    private String nome;
    private int idade;
    private double altura;

    // construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // toString
    @Override
    public String toString() {
        return "Pessoa [altura=" + altura + ", idade=" + idade + ", nome=" + nome + "] \n";
    }

}
