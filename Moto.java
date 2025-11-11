// Classe Moto que herda de Veiculo
class Moto extends Veiculo {

    // Construtor
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método acelerar()
    @Override
    public void acelerar() {
        System.out.println(modelo + " " + marca + " está acelerando e empinando a roda dianteira!");
    }
}