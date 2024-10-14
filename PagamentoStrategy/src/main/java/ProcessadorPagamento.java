public class ProcessadorPagamento {
    private PagamentoStrategy estrategiaPagamento;

    public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void processarPagamento(double valor) {
        if (estrategiaPagamento == null) {
            System.out.println("Nenhuma estratégia de pagamento definida.");
            return;
        }
        estrategiaPagamento.processarPagamento(valor);
    }
}