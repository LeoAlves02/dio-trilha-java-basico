import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<IConta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    public List<IConta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }
}
