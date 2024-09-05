package iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();

        // Testando Aparelho Telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atenderChamada();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador Internet
        meuIphone.exibirPagina("https://www.exemplo.com");
        meuIphone.adicionarAba();
        meuIphone.atualizarPagina();
    }
}
