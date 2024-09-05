package apps;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("Enviando mensagem pelo apps.Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo apps.Telegram");
    }
}
