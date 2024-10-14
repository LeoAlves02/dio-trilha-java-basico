public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        // Pagamento com cartão de crédito
        processador.setEstrategiaPagamento(new PagamentoCartaoCredito());
        processador.processarPagamento(200.0);

        // Pagamento com boleto
        processador.setEstrategiaPagamento(new PagamentoBoleto());
        processador.processarPagamento(150.0);

        // Pagamento com PayPal
        processador.setEstrategiaPagamento(new PagamentoPayPal());
        processador.processarPagamento(300.0);
    }
}