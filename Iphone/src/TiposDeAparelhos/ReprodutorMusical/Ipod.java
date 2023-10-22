package TiposDeAparelhos.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    public void tocar(String nomeMusica) {
        System.out.println("Tocando " + nomeMusica);
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando " + nomeMusica);
    }

}
