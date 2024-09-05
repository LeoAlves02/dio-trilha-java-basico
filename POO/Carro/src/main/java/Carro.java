public class Carro extends Veiculo{

    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado");
    }

    public void confereCombustivel() {
        System.out.println("Conferindo Combustível");
    }

    public void confereCambio() {
        System.out.println("Conferindo câmbio em P");
    }
}
