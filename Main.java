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
