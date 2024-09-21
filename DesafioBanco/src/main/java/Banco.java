import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<IConta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    public void imprimirClientes() {
        for (IConta conta : contas) {
            System.out.println("Cliente: " + conta.getNomeCliente());
            System.out.println("  Conta: Agência 1, Número " + conta.getNumero() + " (" + conta.getClass().getSimpleName() + ")");
            System.out.println();
        }
    }
}
