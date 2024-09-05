package iphone;

import aparelho.AparelhoTelefonicoImpl;
import navegador.NavegadorInternetImpl;
import reprodutor.ReprodutorMusicalImpl;

public class Iphone {

    private ReprodutorMusicalImpl reprodutorMusical;
    private AparelhoTelefonicoImpl aparelhoTelefonico;
    private NavegadorInternetImpl navegadorInternet;

    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }

    // Métodos para interagir com o reprodutor musical
    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos para interagir com o aparelho telefônico
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atenderChamada() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Métodos para interagir com o navegador
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}