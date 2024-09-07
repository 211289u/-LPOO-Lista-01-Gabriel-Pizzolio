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
    }

    public void ligar() {
        System.out.println("A moto está ligada");
    }
}
