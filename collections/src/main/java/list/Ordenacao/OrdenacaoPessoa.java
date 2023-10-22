package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    // atributos
    private List<Pessoa> pessoaList;

    // construtor
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

}
