public abstract class Veiculo implements IFuncoesVeiculo {
    protected String tipo;
    protected boolean abastecido = false;
    protected int velocidade = 0;

    public Veiculo() {
    }

    public void exibirTipo() {
        System.out.println("Tipo: " + tipo);
    }

    @Override
    public void abastecer() {
        this.abastecido = true;
        System.out.println("O veículo foi abastecido.");
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidade = velocidade;
        System.out.println("A velocidade do veículo foi ajustada para " + velocidade + " km/h.");
    }

    public abstract void ligar();
}
