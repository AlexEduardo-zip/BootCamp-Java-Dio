package Iphone;

import TiposDeAparelhos.AparelhoMultifuncional.AparelhoMultifuncional;
import TiposDeAparelhos.AparelhoTelefonico.AparelhoTelefonico;
import TiposDeAparelhos.NavegadorInternet.NavegadorInternet;
import TiposDeAparelhos.ReprodutorMusical.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        AparelhoMultifuncional iphone = new AparelhoMultifuncional();

        AparelhoTelefonico telefone = iphone;
        NavegadorInternet navegador = iphone;
        ReprodutorMusical reprodutor = iphone;

        telefone.ligar(123456789);
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        reprodutor.tocar("Música 1");
        reprodutor.pausar();
        reprodutor.selecionarMusica("Música 2");
    }
}
