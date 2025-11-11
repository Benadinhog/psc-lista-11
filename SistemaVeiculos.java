// Classe SistemaVeiculos para testar o código
public class SistemaVeiculos {

    public static void main(String[] args) {
        // Instanciando objetos das subclasses
        Veiculo carro = new Carro("Fiat", "Uno", 2020);
        Veiculo moto = new Moto("Yamaha", "MT-07", 2022);
        Veiculo caminhao = new Caminhao("Scania", "P340", 2018);

        // Chamando os métodos exibirDetalhes() e acelerar()
        carro.exibirDetalhes();
        carro.acelerar();

        System.out.println(); // Linha em branco para separar

        moto.exibirDetalhes();
        moto.acelerar();

        System.out.println(); // Linha em branco para separar

        caminhao.exibirDetalhes();
        caminhao.acelerar();
    }
}