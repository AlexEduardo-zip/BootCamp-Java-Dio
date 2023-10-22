package main.java.list.Pesquisa;

public class Livro {
    // atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // getters and setters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    // toString
    @Override
    public String toString() {
        return "Livro [anoPublicacao=" + anoPublicacao + ", autor=" + autor + ", titulo=" + titulo + "] \n";
    }
}
