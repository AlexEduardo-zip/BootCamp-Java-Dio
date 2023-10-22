package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogLivros {
    // atributos
    private List<Livro> livrosList;

    // construtor
    public CatalogLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    // main
    public static void main(String[] args) {
        CatalogLivros catalogLivros = new CatalogLivros();
        catalogLivros.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalogLivros.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
        catalogLivros.adicionarLivro("O Silmarillion", "J. R. R. Tolkien", 1977);
        catalogLivros.adicionarLivro("O Nome do Vento", "Patrick Rothfuss", 2007);
        catalogLivros.adicionarLivro("O Temor do Sábio", "Patrick Rothfuss", 2011);
        catalogLivros.adicionarLivro("O Aprendiz de Assassino", "Robin Hobb", 1995);
        catalogLivros.adicionarLivro("O Punhal do Soberano", "Robin Hobb", 1996);
        catalogLivros.adicionarLivro("A Fúria do Assassino", "Robin Hobb", 1997);
        catalogLivros.adicionarLivro("O Dragão Renascido", "Robert Jordan", 1991);
        catalogLivros.adicionarLivro("A Grande Caçada", "Robert Jordan", 1990);
        catalogLivros.adicionarLivro("O Dragão Renascido", "Robert Jordan", 1991);
        catalogLivros.adicionarLivro("A Ascensão da Sombra", "Robert Jordan", 1992);
        catalogLivros.adicionarLivro("O Fogo do Céu", "Robert Jordan", 1993);

        System.out.println(catalogLivros.pesquisarPorAutor("J. R. R. Tolkien"));

        System.out.println(catalogLivros.pesquisarPorIntervaloAnos(1990, 1995));

        System.out.println(catalogLivros.pesquisarPorTitulo("O Dragão Renascido"));
    }

}
