import java.util.List;

public interface IConta {
    void depositar(double valor, boolean registrarHistorico);
    void sacar(double valor);
    void transferir(double valor, IConta contaDestino);
    double getSaldo();
    String getNumero();
    String getHistorico();
    String getNomeCliente(); // Adicionado para identificação do cliente
}
