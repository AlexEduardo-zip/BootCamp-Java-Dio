package TiposDeAparelhos.AparelhoMultifuncional;

import TiposDeAparelhos.AparelhoTelefonico.AparelhoTelefonico;
import TiposDeAparelhos.NavegadorInternet.NavegadorInternet;
import TiposDeAparelhos.ReprodutorMusical.ReprodutorMusical;

public class AparelhoMultifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // Executando como aparelho multifuncional
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero + " a partir de um aparelho multifuncional");
    }

    public void atender() {
        System.out.println("Atendendo chamada a partir de um aparelho multifuncional");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz a partir de um aparelho multifuncional");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " a partir de um aparelho multifuncional");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba a partir de um aparelho multifuncional");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página a partir de um aparelho multifuncional");
    }

    public void tocar(String musica) {
        System.out.println("Tocando " + musica + " a partir de um aparelho multifuncional");
    }

    public void pausar() {
        System.out.println("Pausando música a partir de um aparelho multifuncional");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando " + musica + " a partir de um aparelho multifuncional");
    }
}