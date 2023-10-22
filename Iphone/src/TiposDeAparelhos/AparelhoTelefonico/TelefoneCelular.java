package TiposDeAparelhos.AparelhoTelefonico;

public class TelefoneCelular implements AparelhoTelefonico {
    // ligar
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero);
    }

    // atender
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    // iniciarCorreioVoz
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
