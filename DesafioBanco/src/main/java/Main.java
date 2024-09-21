public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criação das contas com os nomes dos clientes
        ContaCorrente contaCCLeonardo = new ContaCorrente("1", "Leonardo");
        ContaPoupanca contaPoupancaLeonardo = new ContaPoupanca("2", "Leonardo");
        ContaCorrente contaCCMaria = new ContaCorrente("3", "Maria");

        // Adiciona contas ao banco
        banco.adicionarConta(contaCCLeonardo);
        banco.adicionarConta(contaPoupancaLeonardo);
        banco.adicionarConta(contaCCMaria);

        // Exibir clientes e suas contas
        banco.imprimirClientes();

        // Realizar transações
        contaCCLeonardo.depositar(1000, true);
        contaCCLeonardo.sacar(275);
        contaCCLeonardo.transferir(100, contaPoupancaLeonardo);

        contaPoupancaLeonardo.transferir(20, contaCCMaria);
        contaPoupancaLeonardo.sacar(30);

        contaCCMaria.depositar(700, true);
        contaCCMaria.transferir(20, contaPoupancaLeonardo);

        // Exibir históricos
        System.out.println("=== Histórico (ContaCorrente - Leonardo) ===");
        System.out.println(contaCCLeonardo.getHistorico());
        System.out.println("\n=== Histórico (ContaPoupanca - Leonardo) ===");
        System.out.println(contaPoupancaLeonardo.getHistorico());
        System.out.println("\n=== Histórico (ContaCorrente - Maria) ===");
        System.out.println(contaCCMaria.getHistorico());

        // Exibir saldos finais
        System.out.println("\n=== Saldos Finais ===");
        System.out.println("ContaCorrente - Leonardo: R$" + contaCCLeonardo.getSaldo());
        System.out.println("ContaPoupanca - Leonardo: R$" + contaPoupancaLeonardo.getSaldo());
        System.out.println("ContaCorrente - Maria: R$" + contaCCMaria.getSaldo());
    }
}
