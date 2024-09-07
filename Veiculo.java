public abstract class Veiculo {
    protected String tipo;

    public void exibirTipo() {
        System.out.println("Tipo: " + tipo);
    }

    public abstract void ligar();
}
