public class ContaPoupanca extends Conta {
    private String nomeCliente;

    public ContaPoupanca(String numero, String nomeCliente) {
        super(numero);
        this.nomeCliente = nomeCliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            double saldoAnterior = this.saldo;
            this.saldo -= valor;
            adicionarHistorico("Saque: R$" + valor + " (Saldo: " + saldoAnterior + " -> " + this.saldo + ")");
        }
    }

    @Override
    public String getNomeCliente() {
        return nomeCliente;
    }
}
