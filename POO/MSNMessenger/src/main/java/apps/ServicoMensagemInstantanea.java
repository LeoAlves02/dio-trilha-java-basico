package apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //Somente os filhos conhecem esse método
    protected void validarInternet(){
        System.out.println("Validando se está conectado com a internet");
    }

}
