public abstract class Veiculo {
    protected String tipo;
    protected boolean abastecido = false;
    protected int velocidade = 0;

    public void exibirTipo() {
        System.out.println("Tipo: " + tipo);
    }

    public abstract void ligar();
}

public class Carro extends Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = "Carro";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    @Override
    public void ligar() {
        System.out.println("O carro está ligado");
    }
}

public class Moto extends Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super();
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
    }

    @Override
    public void ligar() {
        System.out.println("A moto está ligada");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 1983);
        meuCarro.exibirInformacoes();
        System.out.println();

        Moto minhaMoto = new Moto("Honda", "CB 500", 2021, 250);
        minhaMoto.exibirInformacoes();
        System.out.println();

        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = meuCarro;
        veiculos[1] = minhaMoto;

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
        }
    }
}
