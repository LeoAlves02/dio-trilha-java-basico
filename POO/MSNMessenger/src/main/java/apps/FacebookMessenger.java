package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
