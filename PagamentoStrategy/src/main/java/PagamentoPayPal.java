public class PagamentoPayPal implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
    }
}