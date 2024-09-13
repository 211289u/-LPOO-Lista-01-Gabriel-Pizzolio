public class Moto extends Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cilindradas = cilindradas;
        this.tipo = "Moto";
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Abastecido: " + (abastecido ? "Sim" : "Não"));
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    @Override
    public void ligar() {
        System.out.println("A moto está ligada");
    }
}

// Classe Veiculo
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