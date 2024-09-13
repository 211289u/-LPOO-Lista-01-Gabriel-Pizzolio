public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 1983);
        Moto minhaMoto = new Moto("Honda", "CB 500", 2021, 250);

        System.out.println("Informações antes do abastecimento e aceleração do carro:");
        meuCarro.exibirInformacoes();
        meuCarro.abastecer();
        meuCarro.acelerar(80);
        System.out.println("Informações atualizadas do carro:");
        meuCarro.exibirInformacoes();
        System.out.println();

        System.out.println("Informações antes do abastecimento e aceleração da moto:");
        minhaMoto.exibirInformacoes();
        minhaMoto.abastecer();
        minhaMoto.acelerar(100);
        System.out.println("Informações atualizadas da moto:");
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
