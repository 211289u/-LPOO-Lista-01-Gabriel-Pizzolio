public abstract class Veiculo {
    protected String tipo;
    protected boolean abastecido = false;
    protected int velocidade = 0;

    public Veiculo() {
    }

    public void exibirTipo() {
        System.out.println("Tipo: " + tipo);
    }

    public void abastecer() {
        this.abastecido = true;
        System.out.println("O veículo foi abastecido.");
    }

    public void acelerar(int velocidade) {
        this.velocidade = velocidade;
        System.out.println("A velocidade do veículo foi ajustada para " + velocidade + " km/h.");
    }

    public abstract void ligar();
}
