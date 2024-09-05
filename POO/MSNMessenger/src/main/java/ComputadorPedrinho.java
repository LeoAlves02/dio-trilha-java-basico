import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        //Não se sabe qual APP
        //Mas qualquer um deverá enviar e receber mensagem

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fcb"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
