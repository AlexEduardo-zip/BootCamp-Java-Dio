package TiposDeAparelhos.NavegadorInternet;

public class AparelhoNavegador implements NavegadorInternet {
    // exibirPagina
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    // adicionarNovaAba
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    // atualizarPagina
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}