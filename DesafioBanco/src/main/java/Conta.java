import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    protected double saldo;
    protected String numero;
    protected List<String> historico;

    public Conta(String numero) {
        this.numero = numero;
        this.historico = new ArrayList<>();
        this.saldo = 0;
    }

    public void depositar(double valor, boolean registrarHistorico) {
        if (valor > 0) {
            double saldoAnterior = this.saldo;
            this.saldo += valor;
            if (registrarHistorico) {
                adicionarHistorico("Depósito: R$" + valor + " (Saldo: " + saldoAnterior + " -> " + this.saldo + ")");
            }
        }
    }

    public void transferir(double valor, IConta contaDestino) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.depositar(valor, false); // Não registrar no histórico
            adicionarHistorico("Transferência: R$" + valor + " de " + this.numero + " (" + getClass().getSimpleName() + ") para " + contaDestino.getNumero() + " (" + contaDestino.getClass().getSimpleName() + ") (Saldo: " + (this.saldo + valor) + " -> " + this.saldo + ")");
        }
    }

    protected void adicionarHistorico(String registro) {
        this.historico.add(registro);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getHistorico() {
        return String.join("\n", historico);
    }

    public abstract String getNomeCliente(); // Método abstrato para identificação do cliente
}
