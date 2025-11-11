// Classe Caminhao que herda de Veiculo
class Caminhao extends Veiculo {

    // Construtor
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método acelerar()
    @Override
    public void acelerar() {
        System.out.println(modelo + " " + marca + " está engrenando a próxima marcha e acelerando lentamente.");
    }
}