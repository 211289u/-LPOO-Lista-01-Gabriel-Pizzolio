public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 1983);
        
        meuCarro.exibirInformacoes();
        System.out.println();

        Moto minhaMoto = new Moto("Motocicleta", 250);

        minhaMoto.exibirTipo();
        minhaMoto.exibirCilindradas();
    }
}
