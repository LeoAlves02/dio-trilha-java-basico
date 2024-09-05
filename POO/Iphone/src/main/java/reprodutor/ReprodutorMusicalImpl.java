package reprodutor;

public class ReprodutorMusicalImpl implements ReprodutorMusical {

    private String musicaAtual;

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }
}