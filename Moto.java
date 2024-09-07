public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String tipo, int cilindradas) {
        this.tipo = tipo;
        this.cilindradas = cilindradas;
    }

    public void exibirCilindradas() {
        System.out.println("Cilindradas: " + cilindradas);
    }

    public void ligar() {
        System.out.println("A moto esta ligada.");
    }
}
